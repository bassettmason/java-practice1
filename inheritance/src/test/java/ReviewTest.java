import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {

    @Test
    public void getBody() {
    }

    @Test
    public void getStars() {
    }

    @Test
    public void getAuthorName() {
    }

    @Test
    public void getRestaurant() {
    }

    @Test
    public void testToString() {
        Restaurant Mcdonalds = new Restaurant ("Mcdonalds", "$");
        Review mcReview = new Review ("Mason Bassett", 5, "I'm loving it");
        String expectedResult = "Review by Mason Bassett 5 I'm loving it";
        Mcdonalds.addReview(mcReview);
        assertEquals("Mason Bassett", mcReview.author);
        assertEquals(expectedResult, mcReview.toString());
    }

}