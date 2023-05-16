package io.codelex.classesandobjects.practice;

public class Exercise4 {

    public static void main(String[] args) {

        Movie movie1 = new Movie("Casino Royale", "Eon Productions", "PG-13");
        Movie movie2 = new Movie("Glass", "Buena Vista International", "PG-13");
        Movie movie3 = new Movie("Spider-Man: Into the Spider-Verse", "Columbia Pictures", "PG");


        Movie[] movies = {movie1, movie2, movie3};
        Movie[] pgMovies = Movie.getPG(movies);

        for (Movie x : pgMovies) {
            System.out.println("Title: " + x.getTitle() + "\n" +
                               "Studio: " + x.getStudio() + "\n" +
                               "Rating: " + x.getRating() + "\n");
        }

    }

}
