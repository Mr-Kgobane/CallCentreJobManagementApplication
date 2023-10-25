package com.example.CallCenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.BusinessLogicLayer.TwillioAPI;

@SpringBootApplication
public class CallCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(CallCenterApplication.class, args);
		TwillioAPI testCall = new TwillioAPI();

		testCall.makeTwilioCall();

		String order = "Please confirm that the following is correct:";
		String testNum = "+27826290478";

		testCall.sendOrderDetails(order, testNum);

	}

}
