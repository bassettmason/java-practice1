public class MovieReview extends Review {
    public String movieName;

    public MovieReview(String author, int stars, String body, String movie) {
        super(author, stars, body);
        movieName = movie;
    }

    public String toString() {

        return "Movie review by " + this.author + " " + this.stars + " " + this.body + " " + this.movieName;
    }
}
