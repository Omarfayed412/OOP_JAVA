/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mypackage;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Github: https://github.com/Omarfayed412/OOP_JAVA/tree/main/Movie%20Review%20Management%20System
 * @author Omar Fayed
 */

public class Main {
    public static ArrayList<Movie> movieArray = new ArrayList<Movie>();
    public static ArrayList<User> userArray = new ArrayList<User>();
    //Global Scanner
    
    public static int user_count = 0;
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Welcome :)\n");
        menu();
        //movieArray.get(0).printInfo();
        System.out.println("Thank you :)");
    }
    
    //Creating new user
    public static void createUser() {
        System.out.print("Please enter the user name: ");
        String name = scanner.nextLine();
        User user = new User(name, String.valueOf(user_count));
        userArray.add(user);
        user_count++;
        System.out.println("User '" + name + "' created.");
    }
    
    //Creating new movie
    public static void createMovie() {
        System.out.print("Please enter the movie title: ");
        String title = scanner.nextLine();
        System.out.print("Please enter the movie's director name: ");
        String dir_name = scanner.nextLine();
        System.out.print("Please enter the movie's actors (comma separated): ");
        String actors = scanner.nextLine();
        Movie movie = new Movie(title, dir_name, actors);
        movieArray.add(movie);
        System.out.println("Movie '" + title + "' created by '" + dir_name + "' with actors: " + actors + ".");
    }
    
    //Search for the movie name
    //loacte its index in the list
    //Prepare the review frame (ID:Review:rating)
    //invole the add method 
    public static void addReview() {
        System.out.print("Please enter the movie title: ");
        String title = scanner.nextLine();
        int index_movie = locateMovie(title);
        if (index_movie < 0) return;
        
        System.out.print("Please enter your name(User account required): ");
        String name = scanner.nextLine();
        int index_name = locateUser(name);
        if (index_name < 0) return;
        
        System.out.print("Please enter your review: ");
        String sentence = scanner.nextLine();
        
        System.out.print("Please enter your rating (out of 5): ");
        String rating = scanner.next();
        //Serializing the review to be stored in the class
        (movieArray.get(index_movie)).addReview((userArray.get(index_name).getID()) + ":" +sentence + ":" +rating);
        
        System.out.println("Review added by " + name +": \"" + sentence + "\" with rating " + rating + ".");
    }
    
    
    //Locate movie
    //Locate user
    //invoke delete method
    public static void deleteReview () {
        System.out.print("Please enter the movie title: ");
        String title = scanner.nextLine();
        int index_movie = locateMovie(title);
        if (index_movie < 0) return;
        
        System.out.print("Please enter your name(User account required): ");
        String name = scanner.nextLine();
        int index_name = locateUser(name);
        if (index_name < 0) return;
        
        String review = ((movieArray.get(index_movie)).deleteReview(userArray.get(index_name).getID()).split(":"))[1];
        System.out.print("Review deleted by " + name + ":\"" + review + "\"");
        movieArray.get(index_movie).printInfo();
    }
    
    //Method that prints all the details and reviews on a movie
    public static void movieDetails () {
        System.out.print("Please enter the movie title: ");
        String title = scanner.nextLine();
        int index_movie = locateMovie(title);
        if (index_movie < 0) return;
        movieArray.get(index_movie).printInfo();        
    }
    
    //Returns the index of a movie based on its title
    public static int locateMovie(String name) {
        for (Movie i : movieArray) {
            if (i.getTitle().equalsIgnoreCase(name)) {
                return movieArray.indexOf(i);
            }
        }
        System.out.println("Movie not found.");
        return -1;
    }
    
    //Returns the index of a user based on its name
    public static int locateUser(String name) {
        for (User i : userArray) {
            if (i.getName().equalsIgnoreCase(name)) {
                return userArray.indexOf(i);
            }
        }
        System.out.println("User not found.");
        return -1;
    }
    
    //Method that contains the program manual
    public static void help(){
        System.out.println(" - Create user -> U\n - Create movie -> M");
        System.out.println(" - Add movie review -> A\n - Delete movie review -> D");
        System.out.println(" - Show all reviews -> R\n - Help -> H\n - Exit -> E");
    }
    
    //A method that holds the main routine of the program
    public static void menu() {
        char option;
        System.out.println("Main Menu");
        help();
        
        do {
            System.out.print("Select an option: ");
            option = scanner.next().charAt(0);
            scanner.nextLine(); //Remove redundant \n
            switch (option) {
                case 'U', 'u' -> createUser();
                case 'M', 'm' -> createMovie();
                case 'A', 'a' -> addReview();
                case 'D', 'd' -> deleteReview();
                case 'R', 'r' -> movieDetails();
                case 'H', 'h' -> help();
                case 'E', 'e' -> {}
                default -> System.out.println("Error: invalid option.");
            }
        } while (option != 'E' && option != 'e');
    }
}
