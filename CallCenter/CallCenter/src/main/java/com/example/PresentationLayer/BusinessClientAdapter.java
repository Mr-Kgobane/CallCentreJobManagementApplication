package com.example.PresentationLayer;

import com.example.DataAccessLayer.BusinessClient;

public class BusinessClientAdapter {
    private BusinessClient businessClient;

    public BusinessClientAdapter(BusinessClient businessClient) {
        this.businessClient = businessClient;
    }

    public String adaptClientInfo() {
        return "Business Client: " + businessClient.getCompanyName();
    }
}
