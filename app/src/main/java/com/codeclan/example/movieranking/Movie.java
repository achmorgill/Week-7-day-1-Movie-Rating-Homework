package com.codeclan.example.movieranking;

import static android.R.attr.name;

/**
 * Created by user on 22/05/2017.
 */

public class Movie {


    private String name;
    private String genre;
//    private int ranking;
    public int ranking;

    public Movie(String name, String genre, int ranking) {
        this.name = name;
        this.genre = genre;
        this.ranking = ranking;

    }

    public String getMovieName() {
        return this.name;
    }

    public String getGenreType() {
        return this.genre;
    }

    public int getRanking() {
        return this.ranking;
    }

    public String setMovieName(String name) {
        return this.name = name;
    }

    public String setGenreType(String genreType) {
        return this.genre = genre;
    }

    public int setRanking(int ranking) {
        return this.ranking = ranking;
    }

    public String toString(Movie movie) {
        return movie.name + " " + movie.genre + " " + movie.ranking;
    }
}
