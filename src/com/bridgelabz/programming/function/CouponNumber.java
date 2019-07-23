package com.bridgelabz.programming.function;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CouponNumber {
	public static int gen(int range) {
		int g = (int) (Math.random() * range);
		System.out.print(g+" ");
		return g;

	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		List<Integer> List = new ArrayList<Integer>();
		int count = 0;
		int loop = range;
		sc.close();
		while (loop > 0) {
			int g = gen(range);
			if (!List.contains(g)) {
				List.add(g);
				loop--;
			}
			count++;

		}
		System.out.print(count);
		

	}

}


	


