import java.util.*;

/**
 * Created by Harry on 1/17/17.
 */
public class MovieApp {
    public static void main(String[] args) {

        ArrayList<Movie> movieList = new ArrayList<Movie>();

        // assemble the arrayList of movieObjects
        // add the external MovieIO.java file
        for (int i = 1; i <= 100; i++) {
            movieList.add(MovieIO.getMovie(i));
        }

//        Collections.sort(movieList, new Movie.CategoryTitleSort(new Movie.TitleSort()));


//        //output the titles of the movies
//        for (int i=0; i < movieList.size(); i++) {
//            Collections.sort(movieList, Movie.categorySort);
//            Collections.sort(movieList, Movie.titleSort);
//            System.out.println(movieList.get(i).getCategory() + ", " + movieList.get(i).getTitle());
//        }

//        //enhanced for-loop to output the titles of all movies
//        for(Movie movie : movieList) {
//            System.out.println(movie.getTitle());
//        }


    }
}
