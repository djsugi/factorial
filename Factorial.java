package com.example;

import com.example.Factorial;
import java.util.Scanner;

public class Factorial {

	/**************************************
	 * ・階乗n!の定義（nは非負の整数とする）
	 *   A：0! = 1
　	 *   B：n > 0 ならば　n! = n × (n-1)!
	 */
	
	private static Scanner stdIn;

	public static void main(String[] args) {

		System.out.println("整数を入力してください：");
		stdIn = new Scanner(System.in);

		int x = stdIn.nextInt();

		System.out.println(String.format("「%d」の階乗は「%d」です。", x, factorial(x)));
	}

	private static int factorial(int n) {
		if (n > 0) {
			if (n == 1) {
				System.out.println(n);
			} else {
				System.out.print(n + " x ");
			}
			return n * factorial(n - 1);
		} else {
			return 1;
		}
	}

}
