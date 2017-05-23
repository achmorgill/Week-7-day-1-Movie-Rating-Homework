package com.codeclan.example.movieranking;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 22/05/2017.
 */

public class MovieTest {


    @Test
    public void getMovieName() {
        Movie movie = new Movie ("Jungle Book", "Animated",1);
        assertEquals("Jungle Book", movie.getMovieName());

    }
    @Test
    public void getGenretype() {
        Movie movie = new Movie("Jungle Book", "Animated",1);
        assertEquals("Animated", movie.getGenreType());
    }
    @Test
    public void getRanking() {
        Movie movie = new Movie("Jungle Book", "Animated",1);
        assertEquals(1,movie.getRanking());
    }
    @Test
    public void setMovieName () {
        Movie movie = new Movie("Die Hard", "Action Movie",1);
        movie.setMovieName("Nottinghill");
        assertEquals("Nottinghill", movie.getMovieName());
    }

    @Test
    public void setGenreType () {
        Movie movie = new Movie("Die Hard", "Action",1);
        movie.setGenreType("Action");
        assertEquals("Action", movie.getGenreType());
    }

    @Test
    public void setRanking() {
        Movie movie = new Movie("Die Hard", "Action",1);
        movie.setRanking(1);
        assertEquals(1, movie.getRanking());
    }
    @Test
    public  void printMovieDetails() {
        Movie movie = new Movie("Die Hard", "Action",1);
        String result = movie.toString();
        assertEquals("Die Hard Action 1",result);
    }

}