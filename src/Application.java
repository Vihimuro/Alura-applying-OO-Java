import br.com.himuro.screenmatch.calculations.RecommendationFilter;
import br.com.himuro.screenmatch.calculations.TimeCalculator;
import br.com.himuro.screenmatch.models.Episode;
import br.com.himuro.screenmatch.models.Movie;
import br.com.himuro.screenmatch.models.Serie;

import java.util.ArrayList;

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

        RecommendationFilter recommendationFilter = new RecommendationFilter();
        recommendationFilter.filter(movie);

        Episode episode = new Episode();
        episode.setNumber(1);
        episode.setSerie(serie);
        episode.setTotalVisualizations(50);
        recommendationFilter.filter(episode);

        Movie movie2 = new Movie();
        movie2.setName("Avatar");
        movie2.setReleaseYear(2011);
        movie2.setMinutesDuration(180);
        movie2.registerScore(9);

        Movie movie3 = new Movie();
        movie3.setName("Tom & Jerry");
        movie3.setReleaseYear(2007);
        movie3.setMinutesDuration(123);
        movie3.registerScore(7.8);

        ArrayList<Movie> moviesArrayList = new ArrayList<>();
        moviesArrayList.add(movie);
        moviesArrayList.add(movie2);
        moviesArrayList.add(movie3);
        System.out.println("Size: " + moviesArrayList.size());
        System.out.println("First Movie: " + moviesArrayList.get(0).getName());
        System.out.println(moviesArrayList);
    }
}