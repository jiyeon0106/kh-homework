package com.myself;

import java.util.Scanner;

public class Gugudan3 {
	public void gugudan() {
		Scanner scan = new Scanner(System.in);
		System.out.println("원하는 구구단의 범위를 입력하세요.");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3;
		int num4;
		for (num3 = num1; num3 <= num2; num3++) {
			System.out.println(num3 + "단");
			for (num4 = 1; num4 < 9; num4++) {
				int num5 = num3 * num4;
				System.out.println(num3 + "*" + num4 + "=" + num5);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Gugudan3 g3 = new Gugudan3();
		g3.gugudan();
	}
}
