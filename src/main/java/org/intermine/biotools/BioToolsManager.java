package org.intermine.biotools;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.commons.lang.StringUtils;
import org.intermine.biotools.model.biotools.BioTool;
import org.intermine.biotools.model.biotools.Credit;
import org.intermine.biotools.model.biotools.Download;
import org.intermine.biotools.model.intermine.Instance;
import org.intermine.biotools.model.intermine.InterMineInstances;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BioToolsManager {
    private static final String INTERMINE_REGISTRY = "https://registry.intermine.org/";
    private static final String LIST_WS = "service/instances";
    private static final String BIO_TOOLS = "https://bio.tools/api/tool/";
    private String token = null;

    public BioToolsManager(String token) {
        this.token = token;
    }

    public void addAllInstances() {
        Client client = ClientBuilder.newClient();
        try {
            Response imRegistryResponse = client.target(INTERMINE_REGISTRY + LIST_WS)
                    .request(MediaType.APPLICATION_JSON_TYPE).get();
            if (imRegistryResponse.getStatus() == Response.Status.OK.getStatusCode()) {
                InterMineInstances instances = imRegistryResponse.readEntity(InterMineInstances.class);
                for (Instance instance : instances.getInstances()) {
                    BioTool bioToolsEntry = createBioToolsEntry(instance);
                    if (bioToolsEntry != null) {
                        addBioToolsEntry(bioToolsEntry);
                    }
                }
            }
        } catch (RuntimeException ex) {
            System.out.println("Problems connecting to InterMine registry");
        }
    }

    public void addInstance(String instanceToAdd) {
        Client client = ClientBuilder.newClient();
        try {
            Response imRegistryResponse = client.target(INTERMINE_REGISTRY + LIST_WS)
                    .request(MediaType.APPLICATION_JSON_TYPE).get();
            if (imRegistryResponse.getStatus() == Response.Status.OK.getStatusCode()) {
                InterMineInstances instances = imRegistryResponse.readEntity(InterMineInstances.class);
                for (Instance instance : instances.getInstances()) {
                    if (instanceToAdd.equalsIgnoreCase(instance.getName())) {
                        BioTool bioToolsEntry = createBioToolsEntry(instance);
                        if (bioToolsEntry != null) {
                            addBioToolsEntry(bioToolsEntry);
                        }
                    }
                }
            }
        } catch (RuntimeException ex) {
            System.out.println("Problems connecting to InterMine registry");
        }
    }

    private BioTool createBioToolsEntry(Instance interMineInstance) {
        BioTool bioTool = new BioTool();

        bioTool.setName(interMineInstance.getName());
        bioTool.setDescription(interMineInstance.getDescription());
        bioTool.setHomepage(interMineInstance.getUrl());

        if (!StringUtils.isEmpty(interMineInstance.getReleaseVersion())) {
            bioTool.setVersion(Arrays.asList(interMineInstance.getReleaseVersion()));
        }

        if (!StringUtils.isEmpty(interMineInstance.getMaintainerGithubUrl())) {
            List<Download> downloads = new ArrayList<>();
            downloads.add(new Download(interMineInstance.getMaintainerGithubUrl(), "Source code"));
            bioTool.setDownload(downloads);
        }

        if (!StringUtils.isEmpty(interMineInstance.getMaintainerEmail())) {
            List<Credit> credits = new ArrayList<>();
            credits.add(new Credit(interMineInstance.getMaintainerEmail(), "Person", Arrays.asList("Support")));
            bioTool.setCredit(credits);
        }

        return bioTool;
    }

    private void addBioToolsEntry(BioTool bioToolsEntry) {
        System.out.println("Adding: "+ bioToolsEntry.getName());
        Client client = ClientBuilder.newClient();
        try {
            Response response = client.target(BIO_TOOLS).request()
                    .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON)
                    .header(HttpHeaders.AUTHORIZATION, "Token " + token)
                    .post(Entity.entity(bioToolsEntry, MediaType.APPLICATION_JSON));
            if (response.getStatus() >= 200 && response.getStatus() < 300) {
                System.out.println(bioToolsEntry.getName() + " added");
            } else {
                System.out.println("Problems adding " + bioToolsEntry.getName());
                System.out.println("Status code " + response.getStatus());
            }
        } catch (Exception ex) {
            System.out.println("Problems adding " + bioToolsEntry.getName());
            ex.printStackTrace();
        }
    }
}
