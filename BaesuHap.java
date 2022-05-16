package com.myself;

public class BaesuHap {
	public void baesuhap() {
		int num = 0;
		int total = 0;
		for (num = 1; num < 101; num++) {
			if (num % 3 == 0) {
				total += num;
				System.out.println(total);
			}
		}
	}

	public static void main(String[] args) {
		BaesuHap bh = new BaesuHap();
		bh.baesuhap();
	}
}
