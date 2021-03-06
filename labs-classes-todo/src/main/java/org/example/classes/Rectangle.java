package org.example.classes;

public class Rectangle {
    private float length;
    private float width;

    public Rectangle(float length, float width){
        this.length = length;
        this.width = width;
    }

    public double getArea(){
        return width*length;
    }

    public double getDiagonal() {
        return Math.sqrt(Math.pow(length,2)+Math.pow(width,2));
    }

    public float getLength() {
        return length;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public float getWidth(){
        return width;
    }
}
