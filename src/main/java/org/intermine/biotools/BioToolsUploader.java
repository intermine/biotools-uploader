package org.intermine.biotools;

public class BioToolsUploader {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Input parameters: token and interMine instance's name (if you add a single instance)");
            return;
        }
        String token = args[0];
        BioToolsManager btm = new BioToolsManager(token);
        //add all intermine instances
        if (args.length == 1) {
            System.out.println("Started adding InterMine instances");
            btm.addAllInstances();
            System.out.println("Finished");
            return;
        }
        //add a single instance
        String interMineInstance = args[1]; //e.g. FlyMine
        btm.addInstance(interMineInstance);
        System.out.println("Finished");
    }
}
