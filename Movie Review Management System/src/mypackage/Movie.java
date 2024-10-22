/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mypackage;

import java.util.ArrayList;

/**
 *
 * @author Omar Fayed
 */
public class Movie {
    private String title;
    private String director;
    private String actors;
    //Reviews are members ordered as (ID:Review:rating) 
    private ArrayList<String> reviews = new ArrayList<String>();
    private float rating; 

    public Movie(String title, String director, String actors) {
        this.title = title;
        this.director = director;
        this.actors = actors;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public String getActors() {
        return actors;
    }

    public float getRating() {
        return rating;
    }

    public ArrayList<String> getReviews() {
        return reviews;
    }
    
    //Calcualtes the average rating of the movie
    public void updateRating() {
        float sumRatings = 0; 
        //Split the review->select the third string from splitted array->convert to float
        for (String i : reviews) {
            sumRatings += Float.parseFloat((i.split(":"))[2]);
        }
        this.rating = (float) (sumRatings / (float)reviews.size());
    }
    
    //Adding a review to the array list
    public void addReview(String review) {
        reviews.add(review);
        updateRating();
    }
    
    //Deleting review of specific ID
    public String deleteReview(String ID) {
        int indexReview = locateReview(ID);
        String review = reviews.get(indexReview);
        reviews.remove(indexReview);
        return review;
    }
    
    //Search for a user ID in the reviews
    public int locateReview(String ID) {
        for (String i : reviews) {
            if (i.contains(ID)) {
                return reviews.indexOf(i);
            }
        }
        return -1;
    }
    
    //Printing all the information about the movie
    public void printInfo() {
        System.out.println("Movie: " + this.title);
        System.out.println("Director: " + this.director);
        System.out.println("Actors: " + this.actors);    
        
        //reviews
        String[] words;
        for (String i : this.reviews) {
            words = i.split(":");
            System.out.println("- Review: \"" + words[1] + "\"| Rating: " + words[2]);
        }
        
        System.out.println("Average Rating: " + this.rating);
        
    }
}
