package br.com.himuro.screenmatch.models;

public class Movie extends Title {
    private String Director;

    public String getDirector() {
        return Director;
    }

    public void setDirector(String director) {
        Director = director;
    }
}
