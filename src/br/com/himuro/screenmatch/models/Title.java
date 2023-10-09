package br.com.himuro.screenmatch.models;

import com.google.gson.annotations.SerializedName;

public class Title  implements Comparable<Title>{
    @SerializedName("Title")
    private String name;
    @SerializedName("Year")
    private int releaseYear;
    private boolean isIncludedInPlan;
    private double sumScore;
    private int totalScores;
    private int minutesDuration;

    public Title(String name, int releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
    }

    public Title(OmdbTitle ombdTitle) {
        this.name = ombdTitle.title();
        this.releaseYear = Integer.parseInt(ombdTitle.year());
        this.minutesDuration = Integer.parseInt(ombdTitle.runtime().substring(0, ombdTitle.runtime().length() - 4));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public boolean isIncludedInPlan() {
        return isIncludedInPlan;
    }

    public void setIncludedInPlan(boolean includedInPlan) {
        isIncludedInPlan = includedInPlan;
    }

    public double getSumScore() {
        return sumScore;
    }

    public int getTotalScores() {
        return totalScores;
    }

    public int getMinutesDuration() {
        return minutesDuration;
    }

    public void setMinutesDuration(int minutesDuration) {
        this.minutesDuration = minutesDuration;
    }

    public void showTechnicalSpecifications() {
        System.out.println("Name: " + name);
        System.out.println("Release year: " + releaseYear);
        System.out.println("Sum of Scores: " + sumScore);
        System.out.println("Total scores: " + totalScores );
    }

    public void registerScore (double score) {
        this.sumScore += score;
        this.totalScores++;
    }

    public double averageScore() {
        return sumScore/totalScores;
    }

    @Override
    public int compareTo(Title other) {
        return this.getName().compareTo(other.getName());
    }

    @Override
    public String toString() {
        return  "Title: " + name +
                "(" + releaseYear + ")" +
                " duration: " + minutesDuration + " min";
    }
}
