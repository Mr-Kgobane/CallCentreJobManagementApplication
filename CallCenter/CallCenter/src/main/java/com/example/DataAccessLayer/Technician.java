package com.example.DataAccessLayer;

import java.util.ArrayList;
import java.util.List;

public class Technician {
    private int technicianID;
    private String name;

    public int getTechnicianID() {
        return technicianID;
    }

    public void setTechnicianID(int technicianID) {
        this.technicianID = technicianID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<WorkRequest> getAssignedReq() {
        return assignedReq;
    }

    public void setAssignedReq(List<WorkRequest> assignedReq) {
        this.assignedReq = assignedReq;
    }

    private List<WorkRequest> assignedReq;
    public Technician() {
    }
    public Technician(int technicianID, String name, List<WorkRequest> assignedReq) {
        this.technicianID = technicianID;
        this.name = name;
        this.assignedReq = new ArrayList<>();
    }

    void assignWorkRequest(WorkRequest workRequest){
        assignedReq.add(workRequest);
    }
}
