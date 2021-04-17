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
public class Samsung extends Television {
    private double hoursUsed;
    private int manufactureYear;

    public Samsung(double hoursUsed, int manufactureYear, String brand, int inches) {
        super(brand, inches);
        this.hoursUsed = hoursUsed;
        this.manufactureYear = manufactureYear;
    }

    public double getHoursUsed() {
        return hoursUsed;
    }

    public void setHoursUsed(double hoursUsed) {
        this.hoursUsed = hoursUsed;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }
    public  double powerconsumption(){
        double consumed=hoursUsed*10;
        return consumed;
    }

    @Override
    public String toString() {
        return super.toString()+"\nSamsung{" + "hoursUsed=" + hoursUsed + ", manufactureYear=" + manufactureYear +  ", power consumed per hour="+powerconsumption()+'}';
    }
    
    
    
    
}
