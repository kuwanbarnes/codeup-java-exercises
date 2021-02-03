package shapes;

public class Square extends Rectangle {

    public Square(int side) {
        super(side, side);


        }
    @Override
    public int getArea() {
        int side = 5;
        int area = 4 * side;
    return area;
    }
}
