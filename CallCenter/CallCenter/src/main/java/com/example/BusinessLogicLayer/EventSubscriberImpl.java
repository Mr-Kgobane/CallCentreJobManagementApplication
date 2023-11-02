package com.example.BusinessLogicLayer;

public class EventSubscriberImpl implements EventSubscriber{

    private String name;

    public EventSubscriberImpl(String name) {
        this.name = name;
    }
    @Override
    public void receiveEvent(String event) {
        System.out.println(name + " received event: " + event);
        throw new UnsupportedOperationException("Unimplemented method 'receiveEvent'");
    }

    
}
