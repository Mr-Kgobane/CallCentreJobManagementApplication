package com.example.DataAccessLayer;

public class IndividualClient extends Client{
    public IndividualClient(int clientID, String name, String contactInfo, String status, String personalDetails) {
        super(clientID, name, contactInfo, status);
        this.personalDetails = personalDetails;
    }

    public IndividualClient(int clientID, String name, String contactInfo, String status) {
        super(clientID, name, contactInfo, status);
    }

    public String getPersonalDetails() {
        return personalDetails;
    }

    public void setPersonalDetails(String personalDetails) {
        this.personalDetails = personalDetails;
    }

    private String personalDetails;
}
