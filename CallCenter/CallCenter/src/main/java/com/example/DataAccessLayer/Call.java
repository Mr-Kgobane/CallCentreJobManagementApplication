package com.example.DataAccessLayer;

import java.util.Date;

public class Call {
    public int getCallID() {
        return callID;
    }

    public void setCallID(int callID) {
        this.callID = callID;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getProblemDescription() {
        return problemDescription;
    }

    public void setProblemDescription(String problemDescription) {
        this.problemDescription = problemDescription;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    private int callID;
    private String clientName;
    private String problemDescription;
    private Date timestamp;

    public Call() {
    }

    public Call(int callID, String clientName, String problemDescription, Date timestamp) {
        this.callID = callID;
        this.clientName = clientName;
        this.problemDescription = problemDescription;
        this.timestamp = timestamp;
    }
}
