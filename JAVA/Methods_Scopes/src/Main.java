import java.util.Scanner;

public class Main {

    static Scanner UserInput = new Scanner(System.in);
    static int value1 = 5; //This is a global class variable

    public static void main(String[] args){
        int num1,num2;
        System.out.print("Enter a number: ");
        num1 = scanf();
        System.out.print("Enter another number: ");
        num2 = scanf();

        System.out.println("Local value " + Add(num1,num2));
        value1 = 1;
        System.out.println("Global value " + value1);
    }
    //Access_modifier static returnType MethodeName(ArgumentType ArgumentName)
    public static int Add(int num1 , int num2){
        int number = 1; //This is a local variable
        value1 = num1 + num2; //Modify the global variable
        return value1;
    }
    public static int scanf(){
        return (UserInput.nextInt());
    }
}