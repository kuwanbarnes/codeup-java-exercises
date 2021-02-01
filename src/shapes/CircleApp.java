package shapes;


import util.Input;
import java.util.Scanner;

public class CircleApp { //create a class named CircleApp

    public static void main(String args[]) {
//        System.out.println("enter a radius");//that prompts the user for the radius of the circle using your Input clas
Input input=new Input();
        double radius = input.getDouble();


        Circle circle = new Circle(radius);//creates a Circle object
        ;//displays the circumference and area.
        System.out.println("The Area is : " + circle.getArea());
        System.out.println("The Circumference is : " + circle.getCircumference());

        }
        //Display welcome message





    }
