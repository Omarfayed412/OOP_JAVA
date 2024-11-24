
import java.util.Scanner;

public class Main {

    static Scanner UserInput = new Scanner(System.in);

    public static void main(String[] args){
        int number = 0, sum = 0 ;
        do {
            System.out.print("Enter a number(-1 tp exit): ");
            number = UserInput.nextInt();
            if(number != -1){
                sum += number;
            }
        }
        while(number != -1);
        System.out.println("Sum of these numbers : " + sum);

    }
}