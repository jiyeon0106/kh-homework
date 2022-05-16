package com.myself;

import java.util.Scanner;

public class Gugudan2 {
	public void gugudan() {
		Scanner scan = new Scanner(System.in);
		System.out.println("원하는 값은?");
		int dan = scan.nextInt();
		for(int num=1;num<10;num++) {
			System.out.println(dan+" * "+num+" = "+(dan*num));
		}
		scan.close();
	}

	public static void main(String[] args) {
		Gugudan2 g2 = new Gugudan2 ();
		g2.gugudan();
	}
}
