package com.greatlearning.lab3.main;

import java.util.Scanner;

import com.greatlearning.lab3.implementation.BalancedBracket;

public class Driver {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sample Input");
		String input = scanner.nextLine();
		scanner.close();
		boolean result = BalancedBracket.isBalanced(input);
		System.out.println("Sample Output");
		if (result) {
			System.out.println("The entered String has Balanced Brackets");
		} else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}
	}

}
