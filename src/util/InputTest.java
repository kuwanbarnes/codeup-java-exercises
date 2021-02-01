package util;


import java.util.Scanner;

public class InputTest {



    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        System.out.println("enter number");

        Input input = new Input(System.in);
        System.out.println("getdouble :"+input.getDouble(1,10));
        System.out.println(input.getInt(1,10));
        System.out.println();
        System.out.println("get a String");
        System.out.println(input.getString());
        System.out.println();
        System.out.println("enter yes for true no for false");
        System.out.println(input.yesNo());
    }
}
