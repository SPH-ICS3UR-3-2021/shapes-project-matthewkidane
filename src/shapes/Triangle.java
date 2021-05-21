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
public class Triangle {
private int SideA;
    private int SideB;
    private int SideC;
    private int Height;
    private int perimeter;
    private int area;

    public Triangle() {
        this.SideA = 1;
        this.SideB = 1;
        this.SideC = 1;
        this.Height = 1;
    }

    public Triangle(int side) {
        this.setSideA(side);
        this.setSideB(side);
        this.setSideC(side);
        this.setHeight(side);
    }

    public Triangle(int SideA, int SideB, int SideC, int Height) {
        this.setSideA(SideA);
        this.setSideB(SideB);
        this.setSideC(SideC);
        this.setHeight(Height);
    }

    Triangle(double SideA, double SideB, double SideC, double Height) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getSideA() {
        return SideA;
    }

    public void setSideA(int SideA) {
        this.SideA = SideA;
        this.setArea();
        this.setPerimeter();
    }

    public int getSideB() {
        return SideB;
    }

    public void setSideB(int SideB) {
        this.SideB = SideB;
        this.setArea();
        this.setPerimeter();
    }

    public int getSideC() {
        return SideC;
    }

    public void setSideC(int SideC) {
        this.SideC = SideC;
        this.setArea();
        this.setPerimeter();
    }

    public int getHeight() {
        return Height;
    }

    public void setHeight(int Height) {
        this.Height = Height;
        this.setArea();
        this.setPerimeter();
    }

    private void setArea() {
        this.area = this.SideB * this.Height / 2;
    }

    private void setPerimeter() {
        this.perimeter = this.SideA + this.SideB + SideC;

    }

    public int getArea() {
        return area;
    }

    public int getPerimeter() {
        return perimeter;
    }
}
