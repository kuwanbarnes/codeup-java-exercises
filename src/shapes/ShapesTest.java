package shapes;

public class ShapesTest {

    public static void main(String[] args) {
//Rectangle box1 = new Rectangle(5,4);
//        System.out.println("rectangle area"+box1.getArea());
//        System.out.println("rectangle perimeter"+box1.getPerimeter());
//Rectangle box2= new Square(5);
//        System.out.println("square area"+ box2.getArea());
//        System.out.println("square perimeter"+ box2.getPerimeter());
        Measurable myShape = new Rectangle(5,5);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
        Measurable myShape1 = new Square(5);
        System.out.println(myShape1.getArea());
        System.out.println(myShape1.getPerimeter());



    }
}
