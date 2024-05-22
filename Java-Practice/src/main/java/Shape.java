public class Shape {
  public void area(){
      System.out.println("The area of the shape is: ");
  }
  class Triangle extends Shape{
      public void area(int base, int height){
          System.out.println("The area of the triangle is:" + 1/2 + base * height);
      }
  }


}
