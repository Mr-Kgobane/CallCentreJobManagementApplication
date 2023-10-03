package com.example.DataAccessLayer;

import java.util.Date;

public class ServiceRequest {
    public ServiceRequest(int requestID, String clientName, String serviceType, String status, Date requestDate) {
        this.requestID = requestID;
        this.clientName = clientName;
        this.serviceType = serviceType;
        this.status = status;
        this.requestDate = requestDate;
    }

    public ServiceRequest() {
    }

    private int requestID;
    private String clientName;
    private String serviceType;
    private String status;

    public int getRequestID() {
        return requestID;
    }

    public void setRequestID(int requestID) {
        this.requestID = requestID;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    private Date requestDate;
}
