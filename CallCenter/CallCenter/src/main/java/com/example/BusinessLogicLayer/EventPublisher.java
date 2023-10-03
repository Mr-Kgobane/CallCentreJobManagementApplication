package com.example.BusinessLogicLayer;

public interface EventPublisher {
    void subscribe(EventSubscriber subscriber);
    void unsubscribe(EventSubscriber subscriber);
    void notifySubscribers(String message);
}
