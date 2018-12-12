import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {



    @Test
    public void testToString() {
        Restaurant Mcdonalds = new Restaurant ("Mcdonalds", "$");
        Review mcReview = new Review ("Mason Bassett", 5, "I'm loving it");
        String expectedResult = "Review by Mason Bassett 5 I'm loving it";
        Mcdonalds.addReview(mcReview);
        assertEquals("Mason Bassett", mcReview.author);
        assertEquals(expectedResult, mcReview.toString());
    }
    @Test
    public void testMovieToString() {
        Theater Regal = new Theater ("Regal", "$");
        MovieReview movieReview = new MovieReview ("Mason Bassett", 5, "I'm loving it", "Matrix");
        String expectedResult = "Movie review by Mason Bassett 5 I'm loving it Matrix";
        Regal.addMovieReview(movieReview);
        assertEquals("Mason Bassett", movieReview.author);
        assertEquals(expectedResult, movieReview.toString());
    }

}