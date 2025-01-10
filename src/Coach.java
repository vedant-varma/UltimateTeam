public class Coach extends Person {
    private Rating rating;

    public Coach() {

    }
    public Coach(String name, int age, Country nationality, Type type, Rating rating) {
        super(name, age, nationality, type);
        this.rating = rating;
    }

    public Coach(Rating rating) {
        this.rating = rating;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }
}
