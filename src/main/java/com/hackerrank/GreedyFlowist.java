package com.hackerrank;

public class GreedyFlowist {

	public static void main(String[] args) {
		int[] c = { 1, 3, 5, 7, 9 };
		int k = 3;
		for (int i = 0; i < c.length; i++) {
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] < c[j]) {
					c[i] = c[i] + c[j];
					c[j] = c[i] - c[j];
					c[i] = c[i] - c[j];
				}
			}
		}

		// Find rounds
		int rounds = (c.length / k) + 1;
		int cost = 0;

		for (int i = 0; i < rounds; i++) {
			for (int j = 0; j < k; j++) {
				if (j + i * k < c.length)
					cost = cost + (i + 1) * c[j + i * k];
			}
		}

		System.out.println(cost);

	}

}
