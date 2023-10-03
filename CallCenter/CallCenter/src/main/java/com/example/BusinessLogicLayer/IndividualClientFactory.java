package com.example.BusinessLogicLayer;

import com.example.DataAccessLayer.Client;

public class IndividualClientFactory implements ClientFactory{
    @Override
    public Client createClient(int clientID, String name, String contactInformation, String status) {
        return null;
    }
}
