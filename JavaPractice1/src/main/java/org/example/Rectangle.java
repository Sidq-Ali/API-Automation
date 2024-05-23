package org.example;

public class Rectangle {
    private double width;
  private  double lenght;
public Rectangle(){
    width = 5;
    lenght = 5;
}
public Rectangle(double width, double lenght){
    this.lenght = lenght;
    this.width = width;
}
double getwidht(){
    return width;

}
double getlenght(){
    return lenght;
}


    public void setwidth(double width){
        this.width = width;
    }
    public void print(){
        System.out.println(calculateArea());
    }
    public void setlenght(double lenght){
        this.lenght = lenght;
    }
    public double calculateArea(){
       return width * lenght;
    }

}
