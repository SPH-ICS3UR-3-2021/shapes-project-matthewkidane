/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import java.util.Scanner;

/**
 *
 * @author k_zeb
 */
public class Main {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
        int option;
        do {
            System.out.println("What shpae do you want to make today?");
            System.out.println("1.Rectangle");
            System.out.println("2.Circle");
            System.out.println("3.Triangle");
            System.out.println("4.Rectangular pyramid");
            System.out.println("5.Sphere");
            System.out.println("6.Rectangular prism");
            System.out.println("7.Cone");
            System.out.println("8.Exit");
            option = in.nextInt();
            if (option == 1) {
                System.out.println("what is your length?");
                double length = in.nextDouble();
                System.out.println("What is your width?");
                double width = in.nextDouble();
                Rectangle r1 = new Rectangle(length, width);
                System.out.println("The area of the rectangle is " + r1.getArea() + " and the perimeter is " + r1.getPerimeter());

            } else if (option == 2) {
                System.out.println("what is your radius?");
                double radius = in.nextDouble();
                Circle c1 = new Circle(radius);
                System.out.println("the circle's area is " + c1.getArea() + " and a circumference of " + c1.getCircumference());
} else if (option == 3) {
                System.out.println("What is the length of the first side?");
                double SideA = in.nextDouble();
                System.out.println("What is the length of the second side?");
                double SideB = in.nextDouble();
                System.out.println("What is the length of the third side?");
                double SideC = in.nextDouble();
                System.out.println("What is the height");
                double Height = in.nextDouble();
                Triangle t1 = new Triangle(SideA, SideB, SideC, Height);
                System.out.println("the triangle has a area of " + t1.getArea() + " and a perimeter of " + t1.getPerimeter());
            } else if (option == 4) {
                System.out.println("What is the length?");
                double Length = in.nextDouble();
                System.out.println("What is the width?");
                double Width = in.nextDouble();
                System.out.println("what is the height?");
                double Height = in.nextDouble();
                RectangularPyramid RP1 = new RectangularPyramid(Length, Width, Height);
                System.out.println("The rectangular pyramid volume is" + RP1.getVolume() + " and a surface area of " + RP1.getSurfaceArea());
            } else if (option == 5) {
                System.out.println("What is the radius?");
                double Radius = in.nextDouble();
                Sphere S1 = new Sphere(Radius);
                System.out.println("The volume of your sphere " + S1.getVolume() + " and your sphere has a surface area of " + S1.getSurfaceArea());
} else if (option == 6) {
                System.out.println("What is your length?");
                double Length = in.nextDouble();
                System.out.println("What is your width?");
                double Width = in.nextDouble();
                System.out.println("What is your height?");
                double Height = in.nextDouble();
                RectangularPrism RP2 = new RectangularPrism(Length, Width, Height);
                System.out.println("The volume of your rectangular prism is " + RP2.getVolume() + " and your surface area is " + RP2.getSurfaceArea());
            } else if (option == 7) {
                System.out.println("What is the radius of the cone?");
                double Radius = in.nextDouble();
                System.out.println("What is the height of the cone?");
                double Height = in.nextDouble();
                Cone C1 = new Cone(Radius, Height);
                System.out.println("The Volume of your cone is " + C1.getVolume() + (" and the surface area is " + C1.getSurfaceArea()));

            }

        } while (option != 8);
        in.close();
    }
}

