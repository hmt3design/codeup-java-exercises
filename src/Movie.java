import java.util.Comparator;

/**
 * Created by Harry on 1/17/17.
 */
public class Movie {
    String title;
    String category;

    public Movie(String title, String category) {
        this.title = title;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    // Comparator for sorting the movie titles by name
    public static Comparator<Movie> titleSort = new Comparator<Movie>() {
        public int compare(Movie movie1, Movie movie2) {
            String movieTitle1 = movie1.getTitle();
            String movieTitle2 = movie2.getTitle();
            return movieTitle1.compareTo(movieTitle2);
        }
    };

    // Comparator for sorting the movie categories by name
    public static Comparator<Movie> categorySort = new Comparator<Movie>() {
        public int compare(Movie category1, Movie category2) {
            String genreCategory1 = category1.getCategory();
            String genreCategory2 = category2.getCategory();
            return genreCategory1.compareTo(genreCategory2);
        }
    };
}
