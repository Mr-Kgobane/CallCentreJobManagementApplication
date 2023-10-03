package com.example.DataAccessLayer;

import java.util.Date;

public class WorkRequest {
    public WorkRequest(int requestID, Call call, Technician assignedTech, String status, Date scheduleDate) {
        this.requestID = requestID;
        this.call = call;
        this.assignedTech = assignedTech;
        this.status = status;
        this.scheduleDate = scheduleDate;
    }
    public WorkRequest() {
    }
    private int requestID;
    private Call call;
    private Technician assignedTech;
    private String status;

    public int getRequestID() {
        return requestID;
    }

    public void setRequestID(int requestID) {
        this.requestID = requestID;
    }

    public Call getCall() {
        return call;
    }

    public void setCall(Call call) {
        this.call = call;
    }

    public Technician getAssignedTech() {
        return assignedTech;
    }

    public void setAssignedTech(Technician assignedTech) {
        this.assignedTech = assignedTech;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getScheduleDate() {
        return scheduleDate;
    }

    public void setScheduleDate(Date scheduleDate) {
        this.scheduleDate = scheduleDate;
    }

    private Date scheduleDate;
}
