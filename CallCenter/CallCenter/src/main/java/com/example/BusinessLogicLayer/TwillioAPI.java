package com.example.BusinessLogicLayer;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.entity.StringEntity;
import org.apache.http.util.EntityUtils;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.auth.AuthScope;

public class TwillioAPI {
    private static String twilioAccountSid = "AC2314c44adf5d37330fc63056c8649e41";
    private static String authToken = "d385b2557d693549313a1549e0f17594";  // Replace with your Twilio Auth Token
    private static String fromPhoneNumber = "+27826290478";
    private static String twilioApiUrl = "https://api.twilio.com/2010-04-01/Accounts/" + twilioAccountSid + "/Calls.json";

    private static String getBase64Credentials() {
        String credentials = twilioAccountSid + ":" + authToken;
        return java.util.Base64.getEncoder().encodeToString(credentials.getBytes());
    }

    private static void makeTwilioCall() {
        try {
            // Create a CredentialsProvider instance
            CredentialsProvider credentialsProvider = new BasicCredentialsProvider();
            credentialsProvider.setCredentials(AuthScope.ANY, new UsernamePasswordCredentials(twilioAccountSid, authToken));

            // Create a HttpClient instance with Basic Authentication
            HttpClient httpclient = HttpClients.custom()
                    .setDefaultCredentialsProvider(credentialsProvider)
                    .build();

            // Create a POST request
            HttpPost httpPost = new HttpPost(twilioApiUrl);

            // Set the "From" phone number as a request parameter
            String requestBody = "{\"From\":\"" + fromPhoneNumber + "\"}";
            httpPost.setEntity(new StringEntity(requestBody));

            // Set the "Content-Type" header to application/json
            httpPost.setHeader("Content-Type", "application/json");

            // Execute the POST request
            HttpResponse response = httpclient.execute(httpPost);

            // Get the response entity and convert it to a string
            HttpEntity responseEntity = response.getEntity();
            String responseString = EntityUtils.toString(responseEntity);

            // Handle the response as needed
            System.out.println("Response: " + responseString);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        makeTwilioCall();
    }
}
