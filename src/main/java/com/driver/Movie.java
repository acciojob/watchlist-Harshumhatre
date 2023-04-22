package com.driver;

public class Movie {
    private  String name;
    private int durationInMinutes;
    private double imdbRRating;



    public Movie(){

    }
    public Movie(String name, int durationInMinutes, double imdbRRating) {
        this.name = name;
        this.durationInMinutes = durationInMinutes;
        this.imdbRRating = imdbRRating;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public double getImdbRRating() {
        return imdbRRating;
    }

    public void setImdbRRating(double imdbRRating) {
        this.imdbRRating = imdbRRating;
    }

}