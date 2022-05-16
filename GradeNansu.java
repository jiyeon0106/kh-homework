package com.myself;

import java.util.Random;

public class GradeNansu {
	public void grade() {
		int[] jumsu = new int[5]; 
		Random rd = new Random();
		int total = 0;
		double avg = 0.0;
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = rd.nextInt(101);
		}
		for (int j = 0; j < jumsu.length; j++) {
			total = total + jumsu[j];
		}
		for (int f = 0; f < jumsu.length; f++) {
			avg = total / jumsu.length; 
		}

		int rank[] = { 1, 1, 1, 1, 1 };
		for (int i = 0; i < jumsu.length; i++) {
			rank[i] = 1;
			for (int j = 0; j < jumsu.length; j++) {
				if (jumsu[i] < jumsu[j]) {
					rank[i]++;
				}
			}
		}
		for(int i=0;i<jumsu.length;i++) {
			System.out.println("점수: " + jumsu[i] + " / 등수: " + rank[i]);
		}
		System.out.println("총점: " + total);
		System.out.println("평균: " + avg);
	}

	public static void main(String[] args) {
		GradeNansu gn = new GradeNansu();
		gn.grade();
	}
}
