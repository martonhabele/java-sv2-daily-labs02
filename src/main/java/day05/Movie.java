package day05;

public class Movie {
    private String title;
    private int yearOfMake;
    private int avgRating;
    private int sumOfRatings;

    public Movie(String title, int yearOfMake) {
        this.title = title;
        this.yearOfMake = yearOfMake;
    }

    public double getRatingAvg(int rating) {
        avgRating = (avgRating + rating) / (sumOfRatings + 1);
        return avgRating;
    }
}
