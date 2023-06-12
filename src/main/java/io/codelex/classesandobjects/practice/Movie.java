package io.codelex.classesandobjects.practice;

public class Movie {
    private String title;
    private String studio;
    private String rating;

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this(title, studio, "PG");
    }

    public String getTitle() {
        return title;
    }

    public String getStudio() {
        return studio;
    }

    public String getRating() {
        return rating;
    }

    public static Movie[] getPG (Movie[] movies) {
        int counter = 0;
        for (Movie x : movies) {
            if (x.rating.equals("PG")) counter++;
        }

        Movie[] pgMovies = new Movie[counter];

        int i = 0;
        for (Movie x : movies) {
            if (x.rating.equals("PG")) {
                pgMovies[i] = x;
                i++;
            }
        }
        return pgMovies;
    }

}
