package syntax;

import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        //TODO:Create an integer variable i with a value of 5.
        int i = 5;
        //TODO:Create a while loop that runs so long as i is less than or equal to 15
        while (i <= 15) {
            System.out.println("current value of i : " + i);
            i++;
        }
        //TODO:Each loop iteration, output the current value of i, then increment i by one.

//TODO:Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.

//        int number = 100;
//        do {
//            System.out.println((number -= 5) + " ");} while (number>=-9);
//
//        int number1 = 0;
//        do {System.out.println((number1 += 2));} while (number1<=99);

        double number2 = 2;
        do {
            System.out.printf("%.0f%n", number2);
            number2 = Math.pow(number2, 2);
        } while (number2 < 1000000);

        int a = 0;
        while (a <= 100) {
            if (a % 15 == 0) {
                System.out.println("FIZZBUZZ");
            } else if (a % 5 == 0) {
                System.out.println("buzz");
            } else if (a % 3 == 0) {
                System.out.println("fizz");
            } else {
                System.out.println(a);
            }
            ;
            a++;
            ;
        }
//TODO: Display a table of powers.
//
//TODO:Prompt the user to enter an integer.
//TODO:Display a table of squares and cubes from 1 to the value entered.
//TODO:Ask if the user wants to continue.
//TODO:Assume that the user will enter valid data.
//TODO:Only continue if the user agrees to.
        Scanner sc = new Scanner(System.in);
        String choice = "y";

        do {
            // Get input from the user
            System.out.print("Enter an integer: ");
            int integer = sc.nextInt();

            // Create a header
            String header = "Number | " + "Squared | " + "Cubed   " + "\n"
                    + "------  " + " ------- " + "  -----  ";
            System.out.println(header);

            int square = 0;
            int cube = 0;

            String row = "";
            for (int w = 1; w <= integer; w++) {

                square = w * w;
                cube = w * w * w;

                row = w + "      | "+ square + "       | " + cube;
                System.out.println(row);
            }

            // See if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();

        }
        while (!choice.equalsIgnoreCase("n"));

//TODO:Alter your loop to count backwards by 5's from 100 to -10.
//TODO:Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
    }
}

