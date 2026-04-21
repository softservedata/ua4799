package com.softserve.edu17web;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class TeachClient {

    public static void main(String[] args) {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://speak-ukrainian.eastus2.cloudapp.azure.com/dev/api/cities"))
                //.uri(URI.create("http://localhost:8080/stop"))
                .GET()
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            int statusCode = response.statusCode();
            System.out.println("Status Code: " + statusCode);

            HttpHeaders headers = response.headers();
            System.out.println("Response Headers: " + headers);

            String responseBody = response.body();
            System.out.println("Response Body: " + responseBody);
        } catch (Exception e) {
            System.out.println("Error during request execution: " + e.getMessage());
        }
    }
}
