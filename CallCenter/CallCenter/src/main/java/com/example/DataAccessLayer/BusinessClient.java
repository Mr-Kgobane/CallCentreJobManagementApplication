package com.example.DataAccessLayer;

import java.util.List;

public class BusinessClient extends Client{
    private String companyName;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public List<String> getRelevantPersonnel() {
        return relevantPersonnel;
    }

    public void setRelevantPersonnel(List<String> relevantPersonnel) {
        this.relevantPersonnel = relevantPersonnel;
    }

    private List<String> relevantPersonnel;

    public BusinessClient(int clientID, String name, String contactInfo, String status) {
        super(clientID, name, contactInfo, status);
    }

    public BusinessClient(int clientID, String name, String contactInfo, String status, String companyName, List<String> relevantPersonnel) {
        super(clientID, name, contactInfo, status);
        this.companyName = companyName;
        this.relevantPersonnel = relevantPersonnel;
    }

    void addRelevantPerson(String person){
        relevantPersonnel.add(person);
    }

}
