package com.example;

import com.example.Fibonacci;

public class Fibonacci {

	
	public static void main(String[] args) {
		Fibonacci fibonacci = new Fibonacci();
    	fibonacci.print(Integer.parseInt(args[0]));
    	
    }

    public void print(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(String.valueOf(calc(i + 1)));
        }
    }

    private int calc(int n) {
        // write the awesome code

    	//回答
    	/*
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
    	*/
    	
    	
    	//答え
    	//再帰のテクニック
    	/*
    	 * 1つ前と２つ前のそれぞれの数の場合の結果を足して返す
    	 */
    	return n <= 1 ? n : (calc(n - 2) + calc(n - 1));
    	
    	
    }
    
}
