package shapes;

public class Rectangle {
    protected int length;
    protected int width;

    public Rectangle(int length,int width){
    this.length=length;
    this.width=width;
}

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }



  public  double getArea(){
       return this.length * this.width;
  }
  public double getPerimeter(){
      return 2*this.length + 2* this.width;
   }
}
