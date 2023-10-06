package br.com.himuro.screenmatch.models;

public class Movie extends Title implements Classifiable {
    private String Director;

    public String getDirector() {
        return Director;
    }

    public void setDirector(String director) {
        Director = director;
    }

    @Override
    public int getClassification() {
        return (int) averageScore() / 2;
    }

    @Override
    public String toString() {
        return "Movie: " + this.getName() + " (" + this.getReleaseYear() + ")";
    }
}
