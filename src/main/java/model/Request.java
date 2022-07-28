package model;

public class Request {
    private String batchId;
    private String nextState;

    public Request(String batchId) {
        this.batchId = batchId;
    }

    public String getBatchId() {
        return batchId;
    }
}
