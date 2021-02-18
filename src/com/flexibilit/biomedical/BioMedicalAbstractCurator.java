package com.flexibilit.biomedical;

import com.flexibilit.biomedical.eutils.EFetch;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BioMedicalAbstractCurator {
    // https://pmlegacy.ncbi.nlm.nih.gov/pubmed/31697873
    // https://pubmed.ncbi.nlm.nih.gov/31697873/

    public static void main(String[] args) throws Exception {
        BioMedicalAbstractCurator curator = new BioMedicalAbstractCurator();
        curator.Curate();
    }

    public void Curate() {
        var id = getNextId();
        var pubMedAbstract = getPubMedAbstractById(id);
        var filePath = getFilePath(id);
        saveToFile(filePath, pubMedAbstract);
    }

    private String getPubMedAbstractById(String id) {
        EFetch fetch;
        String database = "pubmed";

        try {
            fetch = new EFetch();
            return fetch.FetchXMLWithIdFromDatabase(id, database);
        } catch (Exception e) {
            return "";
        }
    }

    private String getNextId() {
        return "31697873";
    }

    private Path getFilePath(String id) {
        return Paths.get("data", "AbstractsToBeProcessed", String.format("%s.%s.txt", "pubmed", id));
    }

    private void saveToFile(Path filePath, String content) {
        try {
            Files.writeString(filePath, content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
