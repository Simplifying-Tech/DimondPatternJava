package com.stech;

public class DiamondPatternJava {

	public static void main(String[] args) {
		int n = 9;
				
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++)

			{
				System.out.print(" ");
			}

			for (int j = 1; j <= i * 2 - 1; j++)

			{
				System.out.print("*");
			}
			System.out.println();

		}
		for (int i = n - 1; i > 0; i--) {
			for (int j = 1; j <= n - i; j++)//printing whitespaces

			{
				System.out.print(" ");
			}

			for (int j = 1; j <= i * 2 - 1; j++)//printing stars

			{
				System.out.print("*");
			}
			System.out.println();

		}
	}

}
