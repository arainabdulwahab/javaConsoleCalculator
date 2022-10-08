import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in); // class to read user input
        int num1 =0; // primitive variable for first user input initialized and declared
        char operator; // primitive variable for first user input declared
        int num2 =0; // primitive variable for second user input initialized and declared
        String result =""; // non-primitive variable store result
        System.out.println("Simple calculator with basic functionality \n\n\n"); // title
        System.out.print("\t\t write first digit: "); // prompt for first digit
        num1 = read.nextInt(); // take user input and store it in a variable
        System.out.print("\t\t write second digit: "); // prompt for second digit
        operator = read.next().trim().charAt(0); // take user input of operator to do basic math calculation
        switch(operator){ // logic for basic calculation goes in switch


        } // end switch
    } // end main class
}