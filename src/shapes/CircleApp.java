package shapes;


import util.Input;
import java.util.Scanner;

public class CircleApp {

    public static void main(String args[]) {
        System.out.println("enter radius");
Input Input1=new Input();
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();

        Circle circle = new Circle(radius);
        circle.getArea();
        circle.getCircumference();
        System.out.println(circle.getArea());
        System.out.println(circle.getCircumference());

        }
        //Display welcome message





    }
