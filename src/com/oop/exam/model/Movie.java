package com.oop.exam.model;

import java.util.LinkedList;
import java.util.List;

public class Movie {
    private String title;
    private int year;
    private List<String> actors;
    private String synopsis;
    private String director;
    private List<Platform>platforms;
    private List<Review>reviews;

    public Movie(String title, int year, String director) {
        this.title = title;
        this.year = year;
        this.director = director;

        reviews = new LinkedList<>();
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<String> getActors() {
        return actors;
    }

    public void setActors(List<String> actors) {
        this.actors = actors;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public List<Platform> getPlatforms() {
        return platforms;
    }

    public void setPlatforms(List<Platform> platforms) {
        this.platforms = platforms;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public void addReview(Review review){
        reviews.add(review);
    }
}
