package com.myself;

public class Baesu3_1 {

	public void baesu() {
		int num = 1;
		while (num < 101) {
			if (num % 3 == 0) {
				System.out.println("3의배수");
			} else {
				System.out.println(num);
			} ++num;
		}
	}

	public static void main(String[] args) {
		Baesu3_1 b3 = new Baesu3_1();
		b3.baesu();
	}
}
