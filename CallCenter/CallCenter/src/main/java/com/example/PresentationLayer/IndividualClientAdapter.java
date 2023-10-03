package com.example.PresentationLayer;

import com.example.DataAccessLayer.IndividualClient;

public class IndividualClientAdapter {
    private IndividualClient individualClient;

    public IndividualClientAdapter(IndividualClient individualClient) {
        this.individualClient = individualClient;
    }

    public String adaptClientInfo() {
        return "Individual Client: " + individualClient.getPersonalDetails();
    }
}
