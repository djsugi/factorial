package com.example;

import java.util.Scanner;

import com.example.Fibonacci;

public class Fibonacci {

	private static Scanner stdIn;
	
	public static void main(String[] args) {

		System.out.println("整数を入力してください：");
		stdIn = new Scanner(System.in);

		int x = stdIn.nextInt();
		
		Fibonacci fibonacci = new Fibonacci();
		fibonacci.print(x);
    	
    }

    public void print(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(String.format("%d回目 : %s", i+1,String.valueOf(calc(i + 1))));
        }
    }

    private int calc(int n) {
	
	    	int[] array = new int[n];
	    	
			for(int i=0; i<n; i++) {
				if(i==0 || i==1) {
					array[i]=1;
				}
				else {
					array[i] = array[i-1] + array[i-2];
				}
			}
	    	int index = array.length-1;
	    	return array[index];
    }
    	
    
    
    
    
    
    
    private int calcRecursive(int n) {
	    	//再帰のテクニック
	    	//1つ前と２つ前のそれぞれの数の場合の結果を足して返す
	    	return n <= 1 ? n : (calcRecursive(n - 2) + calcRecursive(n - 1));
    }
    
}
