package com.thoughtworks.rectangle;

public class Rectangle {
private final double length;
private final double breadth;

Rectangle(double length,double breadth){
    this.length=length;
    this.breadth=breadth;
}

public double area ()
{
    return breadth*length;
}

public double perimeter() {
    return 2*(breadth+length);
}

}
