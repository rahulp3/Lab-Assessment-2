package com.gl.controller;

import java.util.Arrays;
import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {
		System.out.println("Enter the size of currency demoninations : ");
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int[] denominationValues = new int[size];
		System.out.println("Enter the currency denominations values :");
		for (int i = 0; i < size; i++) {
			denominationValues[i] = s.nextInt();
		}
		Arrays.sort(denominationValues);
		System.out.println("Enter the amount you want to pay : ");
		int amount = s.nextInt();
		int[] count = new int[size];

		for (int j = size - 1; j >= 0; j--) {
			int q = (int) (amount / denominationValues[j]);
			amount = amount - (q * denominationValues[j]);
			count[j] = q;
		}
		System.out.println("Your payment approach in order to give min no of notes will be : ");
		for (int k = size - 1; k >= 0; k--) {
			if (count[k] != 0)
				System.out.println(denominationValues[k] + " : " + count[k]);
		}

	}

}
