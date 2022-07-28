package model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Req {
    private final String batchId;

    public Req(@JsonProperty("batchId") String batchId) {
        this.batchId = batchId;
    }

    public String getBatchId() {
        return batchId;
    }

    @Override
    public String toString() {
        return "Req{" +
                "batchId='" + batchId + '\'' +
                '}';
    }
}
