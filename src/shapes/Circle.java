/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

/**
 *
 * @author stoov
 */
public class Circle {
   private double radius;
    private double area;
    private double circumference;

    public Circle(double radius) {
        this.radius = radius;
        setCircumference();
        setArea();
    }


    private void setCircumference() {
        this.circumference = 2 * Math.PI * this.radius;
    }

    private void setArea() {
        this.area = Math.PI * this.radius * this.radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getCircumference() {
        return circumference;
    }

    public double getArea() {
        return area;
    } 
}
