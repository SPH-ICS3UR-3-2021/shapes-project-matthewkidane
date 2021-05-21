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
public class RectangularPrism {
 private double length;
    private double width;
    private double height;
    private double volume;
    private double surfaceArea;

    public RectangularPrism() {
        this.length = 1.0;
        this.width = 1.0;
        this.height = 1.0;
    }

    public RectangularPrism(double side) {
        this.setLength(side);
        this.setWidth(side);
        this.setHeight(side);
    }

    public RectangularPrism(double Length, double Width, double Height) {
        this.setLength(Length);
        this.setWidth(Width);
        this.setHeight(Height);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double Length) {
        this.length = Length;
        this.setVolume();
        this.setSurfaceArea();
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double Width) {
        this.width = Width;
        this.setVolume();
        this.setSurfaceArea();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double Height) {
        this.height = Height;
        this.setVolume();
        this.setSurfaceArea();
    }

    private void setVolume() {
        this.volume = this.length * this.width * this.height;
    }

    private void setSurfaceArea() {
        this.surfaceArea = 2 * (this.width * this.length + this.height * this.length + this.height * this.width);

    }

    public double getVolume() {
        return volume;
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }   
}
