package shapes;

public class Circle {
    private double radius;
    double pi =3.14;

    public Circle(double radius){
        this.radius = radius;
    }
    public double getArea(){

       return  pi * (radius * radius);

    }
    public double getCircumference(){
        return   2 * pi * radius;
    }
}
