public class Application {
    public static void main(String[] args) {

        Movie movie = new Movie();
        movie.name = "The GodFather";
        movie.releaseYear = 1970;
        movie.minutesDuration = 180;

        movie.showTechnicalSpecifications();

        movie.registerScore(8.6);
        movie.registerScore(5.0);
        movie.registerScore(10);

        movie.showTechnicalSpecifications();
        System.out.println(movie.averageScore());
    }
}