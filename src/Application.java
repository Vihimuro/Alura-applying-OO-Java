import br.com.himuro.screenmatch.models.Movie;

public class Application {
    public static void main(String[] args) {

        Movie movie = new Movie();
        movie.setName("The Godfather");
        movie.setReleaseYear(1972);
        movie.setMinutesDuration(175);

        movie.showTechnicalSpecifications();

        movie.registerScore(8.6);
        movie.registerScore(9.1);
        movie.registerScore(10);

        movie.showTechnicalSpecifications();
        System.out.printf("Average: %.2f%n",movie.averageScore());
    }
}