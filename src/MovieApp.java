import java.util.*;

/**
 * Created by Harry on 1/17/17.
 */
public class MovieApp {
    public static void main(String[] args) {

        ArrayList<Movie> movieList = new ArrayList<Movie>();

        // assemble the arrayList of movieObjects
        for (int i=1; i<=100; i++){
            movieList.add(MovieIO.getMovie(i));
        }

        //output the titles of the movies
        for (int i=0; i<= movieList.size(); i++) {
            System.out.println(movieList.get(i).getTitle());
        }

        //enhanced for-loop to output the titles of all movies
        for(Movie movie : movieList) {
            System.out.println(movie.getTitle());
        }
    }
}
