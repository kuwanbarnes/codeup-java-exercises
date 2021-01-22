package syntax.docs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ConsoleExercises {
    static public void customFormat(String pattern, double value) {
        DecimalFormat myFormatter = new DecimalFormat(pattern);
        String output = myFormatter.format(value);
        System.out.println(value + "  " + pattern + "  " + output);
    }

    public static void main(String[] args) {
        double pi = 3.14159;

        System.out.format("The value of pi is approximately: %.2f%n", pi);

// TODO: Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
//
        Scanner scanner = new Scanner(System.in);


int interger;
        System.out.println("Enter something: ");
        interger = scanner.nextInt();
        System.out.printf("Your number is %d",interger);
//// TODO: What happens if you input something that is not an integer?
//        // only works with numbers
//         userInput= scanner.nextInt();
//
//        System.out.println("You entered: --> \"" + userInput + "\" <--");
        //TODO:  Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
        Scanner scanner1 = new Scanner(System.in);
        String firstName;
        String middlename;
        String lastName;


        System.out.print("Enter your first name ,middle name, " + "and last name ")
        ;
        firstName = scanner1.next();
        middlename = scanner1.next();
        lastName = scanner1.next();
        System.out.println(firstName + "\n" + middlename + "\n" + lastName);
// TODO:What happens if you enter less than 3 words?
        //system waits for the rest of the words
        // TODO:What happens if you enter less than 3 words?
        //doesnt read the last word
//TODO:Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.
        Scanner scanner2 = new Scanner(System.in);
        String sentence;


        System.out.print("Enter a sentence ")
        ;
        sentence = scanner2.next();

        System.out.println(sentence);
        //TODO:do you capture all the words?
        //only the first world is printed

        //TODO:Rewrite the above example using the nextLine method.
        Scanner scanner4 = new Scanner(System.in);
        String sentence2;


        System.out.print("Enter a sentence for nextLine ")
        ;
        sentence2 = scanner4.nextLine();

        System.out.println(sentence2);

        //TODO:Prompt the user to enter values of length and width of a classroom at Codeup.
        Scanner scanner5 = new Scanner(System.in);
        String input1;
        String input2;



        System.out.print("Enter a values of length and width ")
        ;
        input1 =scanner5.next();
        input2 =scanner5.next();
        if (input1.length() >= 2 || input2.length() >= 2 ) {
            // convert strings to numbers
            float a = Float.parseFloat(input1);
            float b = Float.parseFloat(input2);
            float area =a*b;
            float perimeter = a * a + b * b;
//TODO:Display the area and perimeter of that classroom.
// The area of a rectangle is equal to the length times the width, and the perimeter of a rectangle is equal to 2 times the length plus 2 times the width.
            System.out.println("This is your area: " + area);
            System.out.println("This is your perimeter: " + perimeter);
        }
            //TODO:Use the nextLine method to get user input and parse the resulting string to a numeric type
            //TODO:Assume that the rooms are perfect rectangles.
            //TODO:Assume that the user will enter valid numeric data for length and width.
        }

    }
