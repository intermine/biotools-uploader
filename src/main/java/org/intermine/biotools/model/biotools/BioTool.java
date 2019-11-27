package org.intermine.biotools.model.biotools;

import com.fasterxml.jackson.annotation.*;

import java.util.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "description",
    "homepage",
    "biotoolsID",
    "biotoolsCURIE",
    "version",
    "function",
    "toolType",
    "topic",
    "operatingSystem",
    "language",
    "license",
    "maturity",
    "cost",
    "link",
    "download",
    "documentation",
    "publication",
    "credit"
})
public class BioTool {

    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private String description;
    @JsonProperty("homepage")
    private String homepage;
    @JsonProperty("biotoolsID")
    private String biotoolsID;
    @JsonProperty("biotoolsCURIE")
    private String biotoolsCURIE;
    @JsonProperty("version")
    private List<String> version = null;
    @JsonProperty("function")
    private List<Function> function = null;
    @JsonProperty("toolType")
    private List<String> toolType = null;
    @JsonProperty("topic")
    private List<Topic> topic = null;
    @JsonProperty("operatingSystem")
    private List<String> operatingSystem = null;
    @JsonProperty("language")
    private List<String> language = null;
    @JsonProperty("license")
    private String license;
    @JsonProperty("maturity")
    private String maturity;
    @JsonProperty("cost")
    private String cost;
    @JsonProperty("link")
    private List<Link> link = null;
    @JsonProperty("download")
    private List<Download> download = null;
    @JsonProperty("documentation")
    private List<Documentation> documentation = null;
    @JsonProperty("publication")
    private List<Publication> publication = null;
    @JsonProperty("credit")
    private List<Credit> credit = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public BioTool() {
        setFunction(createDefaultFunction());
        setToolType(Arrays.asList("Web application", "Web service", "Database portal"));
        setTopic(createTopics());
        setOperatingSystem(Arrays.asList("Linux", "Mac"));
        setLanguage(Arrays.asList("R", "Ruby", "Java", "Python", "JavaScript", "Perl"));
        setLicense("LGPL-2.1");
        setMaturity("Mature");
        setCost("Free of charge");
        setLink(createDefaultLinks());
        setDocumentation(createDefaultDocumentation());
        setPublication(createDefaultPublication());
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public BioTool withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public BioTool withDescription(String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("homepage")
    public String getHomepage() {
        return homepage;
    }

    @JsonProperty("homepage")
    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public BioTool withHomepage(String homepage) {
        this.homepage = homepage;
        return this;
    }

    @JsonProperty("biotoolsID")
    public String getBiotoolsID() {
        return biotoolsID;
    }

    @JsonProperty("biotoolsID")
    public void setBiotoolsID(String biotoolsID) {
        this.biotoolsID = biotoolsID;
    }

    public BioTool withBiotoolsID(String biotoolsID) {
        this.biotoolsID = biotoolsID;
        return this;
    }

    @JsonProperty("biotoolsCURIE")
    public String getBiotoolsCURIE() {
        return biotoolsCURIE;
    }

    @JsonProperty("biotoolsCURIE")
    public void setBiotoolsCURIE(String biotoolsCURIE) {
        this.biotoolsCURIE = biotoolsCURIE;
    }

    public BioTool withBiotoolsCURIE(String biotoolsCURIE) {
        this.biotoolsCURIE = biotoolsCURIE;
        return this;
    }

    @JsonProperty("version")
    public List<String> getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(List<String> version) {
        this.version = version;
    }

    public BioTool withVersion(List<String> version) {
        this.version = version;
        return this;
    }

    @JsonProperty("function")
    public List<Function> getFunction() {
        return function;
    }

    @JsonProperty("function")
    public void setFunction(List<Function> function) {
        this.function = function;
    }

    public BioTool withFunction(List<Function> function) {
        this.function = function;
        return this;
    }

    @JsonProperty("toolType")
    public List<String> getToolType() {
        return toolType;
    }

    @JsonProperty("toolType")
    public void setToolType(List<String> toolType) {
        this.toolType = toolType;
    }

    public BioTool withToolType(List<String> toolType) {
        this.toolType = toolType;
        return this;
    }

    @JsonProperty("topic")
    public List<Topic> getTopic() {
        return topic;
    }

    @JsonProperty("topic")
    public void setTopic(List<Topic> topic) {
        this.topic = topic;
    }

    public BioTool withTopic(List<Topic> topic) {
        this.topic = topic;
        return this;
    }

    @JsonProperty("operatingSystem")
    public List<String> getOperatingSystem() {
        return operatingSystem;
    }

    @JsonProperty("operatingSystem")
    public void setOperatingSystem(List<String> operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public BioTool withOperatingSystem(List<String> operatingSystem) {
        this.operatingSystem = operatingSystem;
        return this;
    }

    @JsonProperty("language")
    public List<String> getLanguage() {
        return language;
    }

    @JsonProperty("language")
    public void setLanguage(List<String> language) {
        this.language = language;
    }

    public BioTool withLanguage(List<String> language) {
        this.language = language;
        return this;
    }

    @JsonProperty("license")
    public String getLicense() {
        return license;
    }

    @JsonProperty("license")
    public void setLicense(String license) {
        this.license = license;
    }

    public BioTool withLicense(String license) {
        this.license = license;
        return this;
    }

    @JsonProperty("maturity")
    public String getMaturity() {
        return maturity;
    }

    @JsonProperty("maturity")
    public void setMaturity(String maturity) {
        this.maturity = maturity;
    }

    public BioTool withMaturity(String maturity) {
        this.maturity = maturity;
        return this;
    }

    @JsonProperty("cost")
    public String getCost() {
        return cost;
    }

    @JsonProperty("cost")
    public void setCost(String cost) {
        this.cost = cost;
    }

    public BioTool withCost(String cost) {
        this.cost = cost;
        return this;
    }

    @JsonProperty("link")
    public List<Link> getLink() {
        return link;
    }

    @JsonProperty("link")
    public void setLink(List<Link> link) {
        this.link = link;
    }

    public BioTool withLink(List<Link> link) {
        this.link = link;
        return this;
    }

    @JsonProperty("download")
    public List<Download> getDownload() {
        return download;
    }

    @JsonProperty("download")
    public void setDownload(List<Download> download) {
        this.download = download;
    }

    public BioTool withDownload(List<Download> download) {
        this.download = download;
        return this;
    }

    @JsonProperty("documentation")
    public List<Documentation> getDocumentation() {
        return documentation;
    }

    @JsonProperty("documentation")
    public void setDocumentation(List<Documentation> documentation) {
        this.documentation = documentation;
    }

    public BioTool withDocumentation(List<Documentation> documentation) {
        this.documentation = documentation;
        return this;
    }

    @JsonProperty("publication")
    public List<Publication> getPublication() {
        return publication;
    }

    @JsonProperty("publication")
    public void setPublication(List<Publication> publication) {
        this.publication = publication;
    }

    public BioTool withPublication(List<Publication> publication) {
        this.publication = publication;
        return this;
    }

    @JsonProperty("credit")
    public List<Credit> getCredit() {
        return credit;
    }

    @JsonProperty("credit")
    public void setCredit(List<Credit> credit) {
        this.credit = credit;
    }

    public BioTool withCredit(List<Credit> credit) {
        this.credit = credit;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public BioTool withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    private List<Function> createDefaultFunction() {
        List<Function> functions = new ArrayList<>();
        Function function = new Function();
        //Operation
        List<Operation> op = new ArrayList<>();
        op.add(new Operation("http://edamontology.org/operation_2422", "Data retrieval"));
        op.add(new Operation("http://edamontology.org/operation_0337", "Visualisation"));
        op.add(new Operation("http://edamontology.org/operation_2436", "Gene-set enrichment analysis"));
        op.add(new Operation("http://edamontology.org/operation_0224", "Query and retrieval"));
        function.setOperation(op);

        //Input
        List<Input> inputs = new ArrayList<>();
        inputs.add(new Input(new Data("http://edamontology.org/data_1255", "Sequence features")));
        inputs.add(new Input(new Data("http://edamontology.org/data_2353", "Ontology data")));
        function.setInput(inputs);

        //Output
        List<Output> outputs = new ArrayList<>();
        outputs.add(new Output(new Data("http://edamontology.org/data_3753", "Over-representation data")));
        outputs.add(new Output(new Data("http://edamontology.org/data_3786", "Query script")));
        outputs.add(new Output(new Data("http://edamontology.org/data_1255", "Sequence features")));
        function.setOutput(outputs);

        functions.add(function);
        return functions;
    }

    private List<Topic> createTopics() {
        List<Topic> topics = new ArrayList<>();
        topics.add(new Topic("http://edamontology.org/topic_3071", "Data management"));
        topics.add(new Topic("http://edamontology.org/topic_0622", "Genomics"));
        topics.add(new Topic("http://edamontology.org/topic_0121", "Proteomics"));
        return topics;
    }

    private List<Link> createDefaultLinks() {
        List<Link> links = new ArrayList<>();
        links.add(new Link("https://registry.intermine.org", "Registry"));
        links.add(new Link("http://intermine.org", "Other"));
        return links;
    }

    private List<Documentation> createDefaultDocumentation() {
        List<Documentation> documentations = new ArrayList<>();
        documentations.add(new Documentation("http://intermine.readthedocs.org/en/latest/web-services/", "API documentation"));
        documentations.add(new Documentation("https://flymine.readthedocs.io/en/latest/", "Manual"));
        return documentations;
    }

    private List<Publication> createDefaultPublication() {
        List<Publication> publications = new ArrayList<>();
        publications.add(new Publication("10.1093/bioinformatics/bts577", "Other"));
        return publications;
    }

}
