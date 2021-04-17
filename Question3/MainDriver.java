/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Sai Satyanarayana Gullapalli
 */
public class MainDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Object> arrayOfObjects = new ArrayList<>();

        LoanTest loanData = new LoanTest("Car", 1000000, 7);
        CircleTest circleData = new CircleTest("Satya", 2.5, true);
        String stringData = "Exam";
        Date dateData = new Date();

        arrayOfObjects.add(loanData);
        arrayOfObjects.add(circleData);
        arrayOfObjects.add(stringData);
        arrayOfObjects.add(dateData);

        for (Object LCSD : arrayOfObjects) {
            System.out.println(LCSD);
        }
    }

}

    
