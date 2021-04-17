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
public class Sony extends Television{
  private String resolution;
  private String model;

    public Sony(String resolution, String model, String brand, int inches) {
        super(brand, inches);
        this.resolution = resolution;
        this.model = model;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public  double powerconsumption(){
        double consumed=0.0;
        if(resolution.equalsIgnoreCase("4k")){
            consumed= 1080*3;
        }
        else if(resolution.equalsIgnoreCase("8k")){
            consumed=2160*3;
        }
        return consumed;
        
    }

    @Override
    public String toString() {
        return super.toString()+"\nSony{" + "resolution=" + resolution + ", model=" + model + ", power consumed per hour="+powerconsumption()+ '}';
    }
    
  
}
