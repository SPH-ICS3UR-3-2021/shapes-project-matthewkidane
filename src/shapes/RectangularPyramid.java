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
public class RectangularPyramid {
   private double Length;
    private double Width;
    private double Height;
     private double Volume;
    private double SurfaceArea;

   public RectangularPyramid() {
        this.Length = 1.0;
        this.Width = 1.0;
        this.Height = 1.0;
    }

    public RectangularPyramid(double side) {
        this.setLength(side);
        this.setWidth(side);
        this.setHeight(side);
    }

    public RectangularPyramid(double Length, double Width, double Height) {
        this.setLength(Length);
        this.setWidth(Width);
        this.setHeight(Height);
    }

    public double getLength() {
        return Length;
    }

    public void setLength(double Length) {
        this.Length = Length;
        this.setVolume();
        this.setSurfaceArea();
    }

    public double getWidth() {
        return Width;
    }

    public void setWidth(double Width) {
        this.Width = Width;
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
        this.Volume = this.Length * this.Width * this.Height / 3;
    }

    private void setSurfaceArea() {
        this.SurfaceArea = this.Length * this.Width + this.Length * Math.sqrt(this.Width / 2 * this.Width / 2 + this.Height * this.Height)+ this.Width * Math.sqrt( this.Length / 2 * this.Length / 2+ this.Height * this.Height);

    }

    public double getVolume() {
        return Volume;
    }

    public double getSurfaceArea() {
        return SurfaceArea;
    } 
}
