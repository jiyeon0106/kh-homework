package com.myself;

import java.util.Random;

public class RandomArray_2 {
	public RandomArray_2() {
		Random rd = new Random();
		int num[] = new int[10];
		int i;
		int hap1 = 0;
		int hap2 = 0;

		for (i = 0; i < num.length; i++) {
			int rn = (int) (Math.random() * 21) - 10;
			System.out.println(rn);
			if (rn < 0) {
				hap1 += rn;
			} else if (rn > 0) {
				hap2 += rn;
			}
		}
		System.out.println("음수의 합은? " + hap1);
		System.out.println("양수의 합은? " + hap2);
	}

	public static void main(String[] args) {
		new RandomArray_2();
	}
}
