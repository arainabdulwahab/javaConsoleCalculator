import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in); // class to read user input
        int num1 =0; // primitive variable for first user input initialized and declared
        char operator; // primitive variable for first user input declared
        int num2 =0; // primitive variable for second user input initialized and declared
        String result =""; // non-primitive variable store result
        System.out.println("Simple calculator with basic functionality \n\n\n"); // title
        System.out.print("\t\t type first digit: "); // prompt for first digit
        num1 = read.nextInt(); // take user input and store it in a variable
        System.out.print("\t\t type second digit: "); // prompt for second digit
        num2 = read.nextInt(); // take user input and store it in a variable
        System.out.print("\t\t type an operator ' + ' ' - ' ' * ' ' / ' : "); // prompt for second digit
        operator = read.next().trim().charAt(0); // take user input of operator to do basic math calculation
        switch(operator){ // logic for basic calculation goes in switch
            case '+':
                result = ""  + ( num1 + num2); // add variables and convert into string
            break;
            case '-':
                result = ""  + ( num1 - num2); // subtract variables and convert into string
                break;
            case '*':
                result = ""  + ( num1 * num2); // multiply variables and convert into string
                break;
            case '/':
                result = ""  + ( num1 / num2); // divide variables and convert into string
                break;
            default:
                result = "none of the operator selected aboove";
        } // end switch
        System.out.println(""); // empty lines
        System.out.println("\t\t Result: " + result); // display result
    } // end main class
}