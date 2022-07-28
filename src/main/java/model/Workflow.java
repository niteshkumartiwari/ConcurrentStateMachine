package model;

public class Workflow {
    private String batchId;

    public Workflow(String batchId) {
        this.batchId = batchId;
    }

    public String getBatchId() {
        return batchId;
    }
}
