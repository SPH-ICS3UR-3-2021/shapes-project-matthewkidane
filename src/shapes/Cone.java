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
public class Cone {
   private double Radius;
    private double Height;
    private double SurfaceArea;
    private double Volume;

    public Cone() {
        this.Radius = 1.0;
        this.Height = 1.0;
    }
 public Cone(double side) {
        this.setRadius(side);
        this.setHeight(side);
 }
    public Cone(double Radius, double Height) {
        this.setRadius(1);
        this.setHeight(1);
    }

    public double getRadius() {
        return Radius;
    }

    public void setRadius(double Radius) {
        this.Radius = Radius;
        this.setVolume();
        this.setSurfaceArea();
    }
    public double getHeight() {
        return Height;
    }

    public void setHeight(double Height) {
        this.Height = Height;
        this.setVolume();
        this.setSurfaceArea();
    }
    private void setVolume() {
        this.Volume = Math.PI * this.Radius * this.Radius * this.Height/3 ;
    }

    private void setSurfaceArea() {
        this.SurfaceArea = Math.PI * this.Radius*(this.Radius+ Math.sqrt(this.Height * this.Height + this.Radius * this.Radius));
    }

    public double getVolume() {
        return Volume;
    }

    public double getSurfaceArea() {
        return SurfaceArea;
    } 
}
