package com.myself;

public class Baesu3 {

	public void baesu() {
		int num = 0;
		for (num = 1; num < 101; num++) {
			if (num % 3 == 0) {
				System.out.println("3의배수");
			} else {
				System.out.println(num);
			}
		}
	}

	public static void main(String[] args) {
		Baesu3 b3 = new Baesu3();
		b3.baesu();
	}
}
