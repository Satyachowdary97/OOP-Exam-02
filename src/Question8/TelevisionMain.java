/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question8;

import java.util.Scanner;

/**
 *
 * @author Sai Satyanarayana Gullapalli
 */
public class TelevisionMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Television brand : ");
        String brandName=scan.next();
        System.out.println("Enter Television inches : ");
        int size=scan.nextInt();
        System.out.println("Enter Television resolution :  ");
        String screenResolution=scan.next();
        System.out.println("Enter Television model : ");
        String tvModel=scan.next();
        System.out.println("Enter number of hours used : ");
        double usedHours=scan.nextDouble();
        System.out.println("Enter year of manufacture : ");
        int year = scan.nextInt();
        Sony sonyTv =new Sony(screenResolution,tvModel,brandName,size);
        Samsung samsungTv = new Samsung(usedHours,year,brandName,size);
        System.out.println(sonyTv.toString());
        System.out.println(samsungTv.toString());
        
    }
    
}
