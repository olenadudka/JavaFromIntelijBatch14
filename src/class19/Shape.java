package class19;

public class Shape {
  //  Write program: Shape
    // class has a constructor that takes the radius and has a subclass as  circle class.
   // In circle class create a method to calculate the area of circle. Test your code
    double radius;
    public Shape(double radius){
        this.radius=radius;
    }
}
class Circle  {
    double area;
    public double area(double radius){
        area=3.14*radius*radius;
        return area;

        //void calculateArea(){

      //  System.out.println(Math.PI*Math.pow(radius,2));}

   // }

  //  public static void main(String[] args) {
      //  Circle obj=new Circle();
      //  System.out.println(obj.area(25));
    }

}