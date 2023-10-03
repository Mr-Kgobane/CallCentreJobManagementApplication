package com.example.BusinessLogicLayer;

import com.example.DataAccessLayer.Client;

public interface ClientFactory {
    Client createClient(int clientID, String name, String contactInformation, String status);


}
