package com.example.CallCenter;

import java.util.concurrent.Flow.Publisher;
import java.util.concurrent.Flow.Subscriber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.BusinessLogicLayer.EventPublisher;
import com.example.BusinessLogicLayer.EventPublisherImpl;
import com.example.BusinessLogicLayer.EventSubscriber;
import com.example.BusinessLogicLayer.EventSubscriberImpl;
import com.example.BusinessLogicLayer.TwillioAPI;

@SpringBootApplication
public class CallCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(CallCenterApplication.class, args);

		//Testing API to place a call:

		TwillioAPI testCall = new TwillioAPI();
		testCall.makeTwilioCall();
		String order = "Please confirm that the following is correct:";
		String testNum = "+27826290478";
		testCall.sendOrderDetails(order, testNum);

		//Testing Subscriber Publisher Classes to send orderDetails:

		EventPublisher publisher = new EventPublisherImpl();
        EventSubscriber subscriber1 = new EventSubscriberImpl("Subscriber 1");
        EventSubscriber subscriber2 = new EventSubscriberImpl("Subscriber 2");
        EventSubscriber subscriber3 = new EventSubscriberImpl("Subscriber 3");

        publisher.subscribe(subscriber1);
        publisher.subscribe(subscriber2);
        publisher.subscribe(subscriber3);

        publisher.publishEvent("Event 1");
        publisher.unsubscribe(subscriber2);
        publisher.publishEvent("Event 2");

	}

}
