/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

/**
 *
 * @author Sai Satyanarayana Gullapalli
 */
public class CircleTest {
    private String name;
    private double radius;
    private boolean area;

    public CircleTest(String name, double radius, boolean area) {
        this.name = name;
        this.radius = radius;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public boolean isArea() {
        return area;
    }

    public void setArea(boolean area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "CircleTest{" + "name=" + name + ", radius=" + radius + ", area=" + area + '}';
    }
    
    
    
    
    
    
}


    
