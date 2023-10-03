package com.example.DataAccessLayer;
import java.util.ArrayList;
import java.util.List;

public class Client {

    public Client(int clientID, String name, String contactInfo, String status, List<String> notes) {
        this.clientID = clientID;
        this.name = name;
        this.contactInfo = contactInfo;
        this.status = status;
        this.notes = new ArrayList<>();
    }

    public Client(int clientID, String name, String contactInfo, String status) {
    }

    private int clientID;
    private String name;
    private String contactInfo;
    private String status;
    private List<String> notes;

    void addNotes(String note){
        notes.add(note);
    }

}
