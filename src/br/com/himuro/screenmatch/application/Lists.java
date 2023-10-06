package br.com.himuro.screenmatch.application;

import br.com.himuro.screenmatch.models.Movie;
import br.com.himuro.screenmatch.models.Serie;
import br.com.himuro.screenmatch.models.Title;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        Movie movie = new Movie("The Godfather", 1972);
        movie.registerScore(9);
        Movie movie2 = new Movie("Avatar", 2011);
        movie2.registerScore(8);
        Movie movie3 = new Movie("Tom & Jerry", 2007);
        movie3.registerScore(10);
        Serie serie = new Serie("Breaking Bad", 2010);

        ArrayList<Title> moviesArrayList = new ArrayList<>();
        moviesArrayList.add(movie);
        moviesArrayList.add(movie2);
        moviesArrayList.add(movie3);
        moviesArrayList.add(serie);

        for (Title item: moviesArrayList){
            System.out.println(item + " ");
            if (item instanceof Movie movieAux){
                System.out.println("Classification: " +movieAux.getClassification());
            }
        }

        List<String> findByArtist = new ArrayList<>();
        findByArtist.add("Adam Sandler");
        findByArtist.add("Tom Cruize");
        findByArtist.add("Angelina Jolie");
        System.out.println(findByArtist);

        Collections.sort(findByArtist);
        System.out.println("After sorting");
        System.out.println(findByArtist);

        System.out.println(moviesArrayList);
        Collections.sort(moviesArrayList);
        System.out.println("After sorting");
        System.out.println(moviesArrayList);

        moviesArrayList.sort(Comparator.comparing(Title::getReleaseYear));
        System.out.println("Sort by year");
        System.out.println(moviesArrayList);
    }

}
