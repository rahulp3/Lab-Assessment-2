package com.gl.controller;

import java.util.Scanner;

public class Solution1 {

	public static void main(String[] args) {
		System.out.println("Enter the size of the transcation Array :");
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int[] transactionArray = new int[size];
		System.out.println("Enter the values of array :");
		for (int i = 0; i < size; i++) {
			transactionArray[i] = s.nextInt();
		}
		System.out.println("Enter the total no of targets that needs to be achieved : ");
		int totalTargets = s.nextInt();

		for (int j = 0; j < totalTargets; j++) {
			System.out.println("Enter the value of target : ");
			int target = s.nextInt();
			int sum = 0, transCount = 0;
			for (int k = 0; k < size; k++) {
				sum += transactionArray[k];
				transCount++;

				if (sum >= target) {
					System.out.println("Target achieved after " + transCount + " transactions\n");
					break;
				}
			}
			if (target > sum) {
				System.out.println("Given target is not achieved");
			}
		}
		s.close();
	}

}
