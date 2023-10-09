package br.com.himuro.screenmatch.application;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Search {
    public static void main(String[] args) throws IOException, InterruptedException {

        String key = "insert your key";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a movie to search: ");
        String search = sc.nextLine();
        String urlSearch = "https://www.omdbapi.com/?t=" + search + "&apikey=" + key;


        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(urlSearch))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}
