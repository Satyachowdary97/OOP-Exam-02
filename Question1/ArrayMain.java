/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1;

/**
 *
 * @author Sai Satyanarayana Gullapalli
 */
import java.util.Scanner;
import java.util.ArrayList;
public class ArrayMain {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);// Created scanner

		
		ArrayList<Integer> list = new ArrayList<Integer>();// Created ArrayList

		
		System.out.print("Enter ten integers: ");// enter 10 integers
		for (int i = 0; i < 10; i++) {
			list.add(input.nextInt());
		}

		
		removeDuplicate(list);// Invoke removeDuplicate method

		// Display the output
		System.out.print("The distinct integers are ");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
	}

	// Removes the duplicate elements from an array list of integers
	public static void removeDuplicate(ArrayList<Integer> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i) == list.get(j))
					list.remove(j);
			}
		}
	}
}
