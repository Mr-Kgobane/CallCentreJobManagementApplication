package com.example.BusinessLogicLayer;

public interface EventPublisher {
    void subscribe(EventSubscriber subscriber);
    void unsubscribe(EventSubscriber subscriber);
    void publishEvent(String message);
}
