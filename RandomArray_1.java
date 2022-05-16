package com.myself;

import java.util.Scanner;

public class RandomArray_1 {
	public RandomArray_1() {
		int randNumber;
		int input;
		int sum = 0;
		System.out.println("난수의 갯수는?");
		Scanner sc = new Scanner (System.in);
		input = sc.nextInt();
		
		for (int i=0; i<input; i++) {
			randNumber = (int)(Math.random()*21)-10;
			sum = sum+randNumber;
			System.out.println(randNumber+"");
		}
		System.out.println();
		System.out.println("난수"+input+"개의 합은 "+sum);
	}

	public static void main(String[] args) {
		new RandomArray_1();

	}
}
