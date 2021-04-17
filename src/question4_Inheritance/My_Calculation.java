/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question4_Inheritance;

/**
 *
 * @author Sai Satyanarayana Gullapalli
 */
public class My_Calculation extends Q4_Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
              int a = 30, b = 10;
	      My_Calculation demo = new My_Calculation();
	      demo.addition(a, b);
	      demo.Subtraction(a, b);
	      demo.multiplication(a, b);

    }
    
    
       public void multiplication(int x, int y) {
	      z = x * y;
	      System.out.println("The product of the given numbers:"+z);
	   }

}
