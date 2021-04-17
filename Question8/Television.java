/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question8;

/**
 *
 * @author Sai Satyanarayana Gullapalli
 */
public abstract class Television {
    private String brand;
    private int inches;

    public Television(String brand, int inches) {
        this.brand = brand;
        this.inches = inches;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getInches() {
        return inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }

    @Override
    public String toString() {
        return "Television{" + "brand=" + brand + ", inches=" + inches + '}';
    }
    public abstract double powerconsumption();
    
    
}
