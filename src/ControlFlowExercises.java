import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        //TODO:Create an integer variable i with a value of 5.
//        int i = 5;
//        //TODO:Create a while loop that runs so long as i is less than or equal to 15
//        while (i <= 15) {
//            System.out.printf("%d " , i);
//            i++;
//        }
        //TODO:Each loop iteration, output the current value of i, then increment i by one.

//TODO:Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.

//        int number = 100;
//        do {
//            System.out.println(number);
//        m-=5;
//            } while (number>=-10);
//
//        long   number1 = 2;
//        do {System.out.println((number1);
//        n+=n;
//        } while (number1<=1000000);
//        System.out.println();
//        double number2 = 2;
//        do {
//            System.out.printf("%.0f%n", number2);
//            number2 = Math.pow(number2, 2);
//        } while (number2 < 1000000);

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
//int i =5;
//        while (i <= 15) {
//            System.out.printf("%d " , i);
//            i++;
//        }
        for(int i=5;i<=15;i++){
            System.out.printf("%d ",i);
        }
        System.out.println();
//        do {
//            System.out.printf("%.0f%n", number2);
//            number2 = Math.pow(number2, 2);
//        } while (number2 < 1000000);
        for (long n=2;n < 1000000;n=n*n){
            System.out.println(n);
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

                row = w + "      | " + square + "       | " + cube;
                System.out.println(row);
            }

            // See if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();

        }
        while (!choice.equalsIgnoreCase("n"));

int i=5;
        while (i <= 15) {
            System.out.printf(" %d " , i);
            i++;
        }
//TODO:Alter your loop to count backwards by 5's from 100 to -10.
//TODO:Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
        //TODO:Convert given number grades into letter grades.
        //
        //Prompt the user for a numerical grade from 0 to 100.
        //Display the corresponding letter grade.
        //Prompt the user to continue.
        //Assume that the user will enter valid integers for the grades.
        //The application should only continue if the user agrees to.
        System.out.print("Enter a grade from 0-100: ");
        int input = sc.nextInt();
        String choices ="y";

        if (input >= 88) {
            System.out.println("A");
        } else if (input >= 80 && input <= 87) {
            System.out.println("B");
        } else if (input >= 67 && input <= 79) {
            System.out.println("C");
        } else if (input >= 60 && input <= 67) {
            System.out.println("D");
        } else if (input >= 0 && input <= 59) {
            System.out.println("F");
        }
        System.out.print("Continue? (y/n): ");
        String userResponse = sc.next();
         boolean usercontinue =(!userResponse.equalsIgnoreCase("n"));
        System.out.println(usercontinue);
    }

}

