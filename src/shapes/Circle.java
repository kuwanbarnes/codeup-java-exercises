package shapes;

public class Circle {      //create a class named Circle.
    private double radius; //This class should have a private radius property that is set through the constructor
    double pi =Math.PI; // 6.5= area 132.73, cir= 40.84
//double pi = 3.14;//6.5 = 132.665, cir=40.82
    public Circle(double radius){
        this.radius = radius;
    }
    public double getArea(){

       return  pi * (this.radius * radius);

    }
    public double getCircumference(){
        return   2 * pi * radius;
    }

}
