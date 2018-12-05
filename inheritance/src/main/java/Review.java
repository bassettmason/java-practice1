public class Review {
//global variables
    public Restaurant restaurant;
    public String author;
    public int stars;
    public String body;

//Review Constructor
    public Review(String author, int stars, String body) {
        this.restaurant = null;
        this.author = author;
        this.stars = stars;
        this.body = body;
    }
//stringify my review object
    public String toString() {

        return "Review " +  "by " + this.author + " " + this.stars + " " + this.body;
    }
}