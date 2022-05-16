package com.myself;

import java.util.Random;

public class RandomArray {
	public RandomArray () {
		int [] numbers = new int [10];
		Random rd = new Random();
		int hap = 0;
		
		for (int num=0; num<numbers.length; num++) {
			numbers[num] = rd.nextInt(10)-1;
			hap += numbers[num];
		}
		System.out.println(rd.nextInt());
		System.out.println("총합은? " + hap);
	}

	public static void main(String[] args) {
		new RandomArray();

	}

}