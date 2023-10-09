package br.com.himuro.screenmatch.application;

import br.com.himuro.screenmatch.exceptions.YearConversionException;
import br.com.himuro.screenmatch.models.OmdbTitle;
import br.com.himuro.screenmatch.models.Title;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Search {
    public static void main(String[] args) throws IOException, InterruptedException {

        String key = "insert your key";
        Scanner sc = new Scanner(System.in);
        String search = "";
        List<Title> titles = new ArrayList<>();

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while (!search.equalsIgnoreCase("exit")) {

            System.out.println("Enter a movie to search: ");
            search = sc.nextLine();

            if(search.equalsIgnoreCase("exit")) {
                break;
            }
            try {
                String urlSearch = "https://www.omdbapi.com/?t=" + search + "&apikey=" + key;

                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(urlSearch))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String jsonResponse = response.body();
                System.out.println(jsonResponse);

                OmdbTitle ombdTitle = gson.fromJson(jsonResponse, OmdbTitle.class);
                System.out.println(ombdTitle);


                Title title = new Title(ombdTitle);
                System.out.println(title);

                titles.add(title);
            } catch (NumberFormatException e) {
                System.out.println("An Error occurred: ");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("An Error on search occurred: ");
                System.out.println(e.getMessage());
            } catch (YearConversionException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(titles);

        FileWriter fileWriter = new FileWriter("titles.json");
        fileWriter.write(gson.toJson(titles));
        fileWriter.close();

        System.out.println("Program closed.");
    }
}
