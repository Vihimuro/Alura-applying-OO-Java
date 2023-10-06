package br.com.himuro.screenmatch.application;

import br.com.himuro.screenmatch.models.Movie;
import br.com.himuro.screenmatch.models.Serie;
import br.com.himuro.screenmatch.models.Title;

import java.util.ArrayList;

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
    }

}
