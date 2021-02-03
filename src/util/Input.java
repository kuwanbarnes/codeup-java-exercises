package util;

import java.io.InputStream;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

   public String getString() {
        return getString("please enter a string : ");

    }
  public String getString (String prompt){
        System.out.println(prompt);
        return this.scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.printf("please enter \"yes\" or \"no\": %n");
        String answer = this.scanner.nextLine();
        return (answer.toLowerCase().equals("y") ||
                answer.toLowerCase().equals("yes"));

    }

    public int getInt() {
        System.out.println("Please enter interger: %n");
        return this.scanner.nextInt();
    }
    public int getInt(String prompt) {
        System.out.print(prompt);
        return this.scanner.nextInt();
    }

   public int getInt(int min, int max) {
        while (true) {
            System.out.printf("please enter interger between %d and %d",min,max);
            ;// first prompt user to enter a number between min and max
            int response = scanner.nextInt();// then read the number
            if (response >= min && response <= max) {// if the number is in range, return it
                return response;

            }
        }
    }

    public double getDouble() {
        System.out.printf("please enter a double: %n");
        return this.scanner.nextDouble();
    }


   public double getDouble(double min, double max) {
        while (true) {
            double response1 = this.scanner.nextDouble();// then read the number
            if (response1 >= min && response1 <= max) {// if the number is in range, return it

                return response1;
            }


        }
    }
}

//    public static void main(String[] args) {
//        Input in =new Input();
//    }

//    public Input() {
//        this.scanner = new Scanner(System.in);
//        String input1 = scanner.nextLine();
//input1= getString ();
//        System.out.println(input1);
//        String answer = scanner.next().toLowerCase();
//
//        }






//        boolean yesNo()
//        int getInt(int min, int max)
//        int getInt()
//        double getDouble(double min, double max)
//        double getDouble()