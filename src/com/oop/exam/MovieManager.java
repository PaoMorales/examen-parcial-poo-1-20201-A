package com.oop.exam;

import com.oop.exam.model.Movie;

import java.util.LinkedList;
import java.util.List;

public class MovieManager {
    private LinkedList<Movie>movies;

    public MovieManager(){
        this.movies = new LinkedList<>();
    }

    public LinkedList<Movie>getMovies(){
        return movies;
    }

    public void addMovie(Movie lordofTheRings1){
        movies.add(lordofTheRings1);
    }

    public Movie findMovie(String title){
        for (Movie movie: movies){
            if (movie.getTitle().equals(title)){
                return movie;
            }
        }
        return null;
    }
}

