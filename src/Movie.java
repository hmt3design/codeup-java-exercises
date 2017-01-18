import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

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


    // chained comparator that sorts by category, then title
    public class CategoryTitleSort implements Comparator<Movie> {

        public List<Comparator<Movie>> listComparators;

        @SafeVarargs
        public CategoryTitleSort(Comparator<Movie>... comparators) {
            this.listComparators = Arrays.asList(comparators);
        }

        @Override
        public int compare(Movie category1, Movie category2) {
            for (Comparator<Movie> comparator : listComparators) {
                int result = comparator.compare(category1, category2);
                if (result != 0) {
                    return result;
                }
            }
            return 0;
        }
    }


    // Comparator for sorting the movie titles by name
    public static class TitleSort implements Comparator<Movie> {
        @Override
        public int compare(Movie movie1, Movie movie2) {
            return movie1.getTitle().compareTo(movie2.getTitle());
        }
    };



}
