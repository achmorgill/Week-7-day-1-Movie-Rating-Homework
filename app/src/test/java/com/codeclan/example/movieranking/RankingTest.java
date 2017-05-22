package com.codeclan.example.movieranking;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by user on 22/05/2017.
 */
public class RankingTest {

    @Before
    public void before() {
        Movie movie1 = new Movie ("Jungle Book", "Animated",1);
        Movie movie2 = new Movie ("Die Hard", "Action",2);
        Movie movie3 = new Movie ("Nottinghill", "Drama",3);
        Movie movie4 = new Movie ("Star Trek", "Sci Fi",4);
        ArrayList<Movie> movieList = new ArrayList<Movie>();
    }

    @Test
    public void addMoviesToMovieList() {
        Ranking movieList = new Ranking();

        Movie movie1 = new Movie ("Jungle Book", "Animated",1);
        Movie movie2 = new Movie ("Die Hard", "Action",2);
        Movie movie3 = new Movie ("Nottinghill", "Drama",3);
        Movie movie4 = new Movie ("Star Trek", "Sci Fi",4);

        movieList.add(movie1);
        movieList.add(movie2);
        movieList.add(movie3);
        movieList.add(movie4);

        assertEquals(4,movieList.getNumberOfMovies());

    }

    @Test
    public void removeMovieFromMovieListByRank() {
        Ranking movieList = new Ranking();
        Movie movie1 = new Movie ("Jungle Book", "Animated",1);
        Movie movie2 = new Movie ("Die Hard", "Action",2);
        Movie movie3 = new Movie ("Nottinghill", "Drama",3);
        Movie movie4 = new Movie ("Star Trek", "Sci Fi",4);

        movieList.add(movie1);
        movieList.add(movie2);
        movieList.add(movie3);
        movieList.add(movie4);

        movieList.remove(movie4);

        assertEquals(3,movieList.getNumberOfMovies());

    }

    @Test
    public void canGetMovieByRank() {
        Ranking movieList = new Ranking();
        Movie movie1 = new Movie ("Jungle Book", "Animated",1);
        Movie movie2 = new Movie ("Die Hard", "Action",2);
        Movie movie3 = new Movie ("Nottinghill", "Drama",3);
        Movie movie4 = new Movie ("Star Trek", "Sci Fi",4);

        movieList.add(movie1);
        movieList.add(movie2);
        movieList.add(movie3);
        movieList.add(movie4);

        String result = movieList.getMovieByRanking(movie2);

        assertEquals("Die Hard", result);
    }




}