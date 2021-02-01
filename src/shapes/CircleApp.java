package shapes;


import util.Input;
import java.util.Scanner;

public class CircleApp { //create a class named CircleApp

    public static void main(String args[]) {
        System.out.println("enter a radius");//that prompts the user for the radius of the circle using your Input clas
Input Input1=new Input(System.in);
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();

        Circle circle = new Circle(radius);//creates a Circle object
        circle.getArea();
        circle.getCircumference();//displays the circumference and area.
        System.out.println("The Area is : " + circle.getArea());
        System.out.println("The Circumference is : " + circle.getCircumference());

        }
        //Display welcome message





    }
