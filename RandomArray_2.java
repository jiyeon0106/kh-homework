package com.myself;

import java.util.Random;

public class RandomArray_2 {
	public RandomArray_2() { 
		Random rd = new Random(); // 랜덤으로 숫자 채번
		int num[] = new int[10]; // 정수 10개 채번을 위해 배열 사용
		int i;
		int hap1 = 0; // 음수의 합을 구해주기 위한 변수
		int hap2 = 0; // 양수의 합을 구해주기 위한 변수

		for (i = 0; i < num.length; i++) {
			int rn = (int) (Math.random() * 21) - 10; // int rn에 -10~10까지의 수 지정
			System.out.println(rn); //채번한 숫자 출력
			if (rn < 0) {
				hap1 += rn; // 음수의 합 구하기
			} else if (rn > 0) {
				hap2 += rn; // 양수의 합 구하기
			}
		}
		System.out.println("음수의 합은? " + hap1); //음수 합 출력
		System.out.println("양수의 합은? " + hap2); //양수 합 출력
	}

	public static void main(String[] args) {
		new RandomArray_2(); 
	}
}
