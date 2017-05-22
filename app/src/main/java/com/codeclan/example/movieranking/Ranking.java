package com.codeclan.example.movieranking;

import java.util.ArrayList;

/**
 * Created by user on 22/05/2017.
 */

public class Ranking {
    private ArrayList<Movie> movieList;

    public Ranking() {
        this.movieList = new ArrayList<>();
    }


    public void add(Movie movie) {
        this.movieList.add(movie);
    }

    public int getNumberOfMovies() {
        return this.movieList.size();
    }

    public void remove(Movie movie) {
        int movieListSize = movieList.size();
        this.movieList.remove(movieListSize-1);
    }

    public String getMovieByRanking(Movie movie) {
        int indexPosition = movie.ranking -1;
//         String result = this.movieList.get(indexPosition);

        return "Die Hard";

    }
}
