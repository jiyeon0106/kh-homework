package com.myself;

public class BaesuHap_1 {
	public void baesuhap() {
		int num = 1;
		int i = 0;
		int total = 0;
		while (num < 101) {
			if (num % 3 == 0) {
				total += num;
				System.out.println(total);
			}
			++num;
		}
	}

	public static void main(String[] args) {
		BaesuHap_1 bh = new BaesuHap_1();
		bh.baesuhap();
	}
}
