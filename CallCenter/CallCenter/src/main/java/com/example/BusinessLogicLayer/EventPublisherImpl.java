package com.example.BusinessLogicLayer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Flow.Subscriber;

public class EventPublisherImpl implements EventPublisher{
    private List<EventSubscriber> subscribers = new ArrayList<>();

    @Override
    public void subscribe(EventSubscriber subscriber) {
        subscribers.add(subscriber);
        throw new UnsupportedOperationException("Unimplemented method 'subscribe'");
    }

    @Override
    public void unsubscribe(EventSubscriber subscriber) {
        subscribers.remove(subscriber);
        throw new UnsupportedOperationException("Unimplemented method 'unsubscribe'");
    }

    @Override
    public void publishEvent(String event) {
        for (EventSubscriber subscriber : subscribers) {
            subscriber.receiveEvent(event);
        }
        throw new UnsupportedOperationException("Unimplemented method 'publishEvent'");
    }
    
}
