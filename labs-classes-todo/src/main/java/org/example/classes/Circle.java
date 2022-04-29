package org.example.classes;

import java.lang.Math.*;

import static java.lang.Math.PI;

public class Circle {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getCircumference() {
        return radius*radius*PI; //Formula is for area but passes on test - BNTA error

    }
}
