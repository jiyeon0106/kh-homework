package com.myself;

public class Gugudan1 {
	public void gugudan() {
		int dan;
		int num;
		for (dan = 2; dan < 10; dan++) {
			System.out.println("<" + dan + "단>"); // 단 출력
			for (num = 1; num < 10; num++) { // 이중for문 사용
				System.out.println(dan + "*" + num + " = " + (dan * num)); // 구구단 결과 출력
			}
			System.out.println(); // num값이 바뀔떄 줄바꿈
		}
	} // end of gugudan

	public static void main(String[] args) {
		Gugudan1 g1 = new Gugudan1(); // 인스턴스화
		g1.gugudan();
	} // end of main
} // end of class