import java.util.Scanner;
//to use the ful utility of java classes write
//import java.util.*;
public class Main {
    //create an object named UserInput that takes in input from user
    //you have to always write the new in the assignment
    //System.in defines what stream does the computer going to look for
    //in this case it's the keyboard
    static  Scanner UserInput = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        //This function .hasNextInt() checks if the input data is of type integer
       int number1 = UserInput.nextInt();
       System.out.print("Enter another number: ");
       byte number2 = UserInput.nextByte();
       System.out.println("You entered " + (number1 + number2));
       System.out.println("The Computer picked " + ((int) ((Math.random() * 10) + 1)) + " as a random number");
    }
}