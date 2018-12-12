import org.junit.Test;

import static org.junit.Assert.*;

public class TheaterTest {

    @Test
    public void addTheater() {
        Theater Regal = new Theater ("Regal", "$");
        MovieReview movieReview1 = new MovieReview ("Mason Bassett", 5, "I'm loving it", "Matrix");
        MovieReview movieReview2 = new MovieReview ("Mason Bassett", 4, "I'm loving it", "Matrix");        Review mcReview3 = new Review ("Mason Bassett", 3, "I'm loving it");
        MovieReview movieReview3 = new MovieReview ("Mason Bassett", 3, "I'm loving it", "Matrix");


        Regal.addMovieReview(movieReview1);
        Regal.addMovieReview(movieReview2);
        Regal.addMovieReview(movieReview3);
        double expected = 4.0;
        assertTrue(Regal.stars == expected);
        assertTrue(Regal.reviewList.size() == 3);
    }

    @Test
    public void addMovieReview() {
        Theater Regal = new Theater ("Regal", "$");
        MovieReview movieReview1 = new MovieReview ("Mason Bassett", 5, "I'm loving it", "Matrix");
        MovieReview movieReview2 = new MovieReview ("Mason Bassett", 4, "I'm loving it", "Matrix");        Review mcReview3 = new Review ("Mason Bassett", 3, "I'm loving it");
        MovieReview movieReview3 = new MovieReview ("Mason Bassett", 3, "I'm loving it", "Matrix");


        Regal.addMovieReview(movieReview1);
        Regal.addMovieReview(movieReview2);
        Regal.addMovieReview(movieReview3);
        double expected = 4.0;
        assertTrue(Regal.stars == expected);
        assertTrue(Regal.reviewList.size() == 3);
    }


    @Test
    public void addMovie() {
        Theater Regal = new Theater ("Regal", "$");

        MovieReview movieReview1 = new MovieReview ("Mason Bassett", 4, "I'm loving it", "Matrix");        Review mcReview3 = new Review ("Mason Bassett", 3, "I'm loving it");
        MovieReview movieReview2 = new MovieReview ("Mason Bassett", 6, "I'm loving it", "Matrix 2");


        Regal.addMovie("Matrix");
        Regal.addMovie("Matrix 2");
        Regal.addMovieReview(movieReview1);
        Regal.addMovieReview(movieReview2);
        double expected = 5.0;
        assertTrue(Regal.stars == expected);
        assertTrue(Regal.movieList.size() == 2);

    }

    @Test
    public void removeMovie() {
        Theater Regal = new Theater ("Regal", "$");



        Regal.addMovie("Matrix");
        Regal.addMovie("Matrix 2");
        Regal.removeMovie(("Matrix 2"));

        assertTrue(Regal.movieList.size() == 1);
    }


}