package day05;

public class MovieMain {
    public static void main(String[] args) {
       Movie movie = new Movie("Devil's Advocate", 1996);
       Viewer viewer = new Viewer();
       viewer.watchMovie(movie, 4);
    }
}