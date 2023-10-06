public class Movie {
    public String name;
    int releaseYear;
    boolean isIncludedInPlan;
    double sumScore;
    int totalScores;
    int minutesDuration;

    public Movie() {
    }

    void showTechnicalSpecifications() {
        System.out.println("Name: " + name);
        System.out.println("Release year: " + releaseYear);
        System.out.println("Sum of Scores: " + sumScore);
        System.out.println("Total scores: " + totalScores );
    }

    void registerScore (double score) {
        this.sumScore += score;
        this.totalScores++;
    }

    double averageScore() {
        return sumScore/totalScores;
    }
}
