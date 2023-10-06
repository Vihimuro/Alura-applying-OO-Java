import br.com.himuro.screenmatch.calculations.TimeCalculator;
import br.com.himuro.screenmatch.models.Movie;
import br.com.himuro.screenmatch.models.Serie;

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

        Serie serie = new Serie();
        serie.setName("Breaking Bad");
        serie.setReleaseYear(2010);
        serie.showTechnicalSpecifications();
        serie.setSeasons(6);
        serie.setEpisodesPerSeason(10);
        serie.setMinutesPerEpisode(50);
        System.out.println("Minutes for complete: " + serie.getMinutesDuration());

        TimeCalculator timeCalculator = new TimeCalculator();
        timeCalculator.insert(movie);
        System.out.println(timeCalculator.getTotalTime());
    }
}