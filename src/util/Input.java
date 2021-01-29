package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);

    }

    public String getString() {
        return "hello";
    }

    public boolean yesNo(char y) {
        return true;
    }

    public static int getInt(int min, int max) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between " + min + "and" + max + ": ");// first prompt user to enter a number between min and max
        int response = sc.nextInt();// then read the number
        if (response >= min && response <= max) {// if the number is in range, return it
            System.out.println("num in range ");
            return response;
        } else {
            System.out.println("num not in range ");
            return getInt(min, max);// else, return getInteger(min, max)


        }
    }
    public static int getDouble(double min, double max) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between " + min + "and" + max + ": ");// first prompt user to enter a number between min and max
        int response = sc.nextInt();// then read the number
        if (response >= min && response <= max) {// if the number is in range, return it
            System.out.println("num in range ");
            return response;
        } else {
            System.out.println("num not in range ");
            return getDouble(min, max);// else, return getInteger(min, max)


        }
    }
    public  double getDouble(){
        System.out.println("ENTER DOUBLE : ");
return this.scanner.nextDouble();
    }
}


//        boolean yesNo()
//        int getInt(int min, int max)
//        int getInt()
//        double getDouble(double min, double max)
//        double getDouble()