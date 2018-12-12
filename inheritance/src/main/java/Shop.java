import java.util.ArrayList;

public class Shop {
    //Global variable
    public String name;
    public double stars;
    public String price;
    public ArrayList<Review> reviewList;
    //Shop constructor takes a name and price "$"
    public Shop(String name, String price) {
        this.name = name;
        this.stars = 0;
        this.price = price;
        this.reviewList = new ArrayList<Review>();
    }
    //addReview method takes in a review and adds it to the restaurant and then replaces stars of the restaurant with avgStars()
    public void addReview(Review review) {

        this.reviewList.add(review);
        review.reviewedName = this;
        stars = avgStars();
    }
    //avgStars adds up all the review star votes and returns average
    public Double avgStars(){

        int size = reviewList.size();
        int total = 0;
        for (Review s : reviewList) {
            total +=  s.stars;
        }

        return (double)total/(double)size;
    }
    //toString stringify my shop objects
    public String toString(){
        return "Shop name: " + this.name + " Rating: " + this.stars + " Cost: " +this.price;
    }
}
