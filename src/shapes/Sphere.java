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
public class Sphere {
    private double Radius;
    private double SurfaceArea;
    private double Volume;

    public Sphere() {
        this.Radius = 1.0;
    }

    public Sphere(double Radius) {
        this.setRadius(1);
    }

    public double getRadius() {
        return Radius;
    }

    public void setRadius(double Radius) {
        this.Radius = Radius;
        this.setVolume();
        this.setSurfaceArea();
    }

    private void setVolume() {
        this.Volume = Math.PI * Math.pow(this.Radius, 3);
    }

    private void setSurfaceArea() {
        this.SurfaceArea = Math.pow(this.Radius, 2) * Math.PI * 4;
    }

    public double getVolume() {
        return Volume;
    }

    public double getSurfaceArea() {
        return SurfaceArea;
    }
}
