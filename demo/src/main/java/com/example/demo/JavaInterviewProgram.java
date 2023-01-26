package com.example.demo;

import java.util.Arrays;

public class JavaInterviewProgram {

	
	
	/*
	 * System.out.println("String Reverse   :"+JavaInterviewProgram.stringReverse(
	 * "Ashivn"));
	 * System.out.println("String Palindron or not   :"+JavaInterviewProgram.
	 * stringisPalindrop("asa"));
	 * System.out.println("Second Large number in Arry   :"+JavaInterviewProgram.
	 * findSecondlargenumberinaarry());
	 */
	public static boolean isPrimeNumberOrNot(int number) {

		
		
		int rev = 0;
		int tmp = number;
		while (number != 0) {
			int rim = number % 10;
			rev = (rev * 10) + rim;
			number = number / 10;
		}
		if (tmp == number) {
			return true;
		} else {
			return false;
		}
	}

	public static String stringReverse(String s) {
		char arry[] = s.toCharArray();
		StringBuffer sb = new StringBuffer();
		for (int i = arry.length - 1; i >= 0; i--) {
			sb.append(arry[i]);
		}
		return sb.toString();
	}

	public static String stringisPalindrop(String s) {
		char arry[] = s.toCharArray();
		StringBuffer sb = new StringBuffer();
		for (int i = arry.length - 1; i >= 0; i--) {
			sb.append(arry[i]);
		}
		if (s.equalsIgnoreCase(sb.toString())) {
			return "yes string is Palindrom";
		} else {
			return "Not Palindrom";
		}

	}

	public static int findSecondlargenumberinaarry() {

//			Arrays.sort(a);
//			return a[total-2];
//			

		int arry[] = { 2, 3, 5, 6, 10, 70 };
		for (int i = 0; i <= arry.length - 1; i++) {

			for (int j = i + 1; j < arry.length; j++) {
				if (arry[i] > arry[j]) {
					int tmp = 0;

					tmp = arry[i];
					arry[i] = arry[j];
					arry[j] = tmp;
				}
			}

		}
		return arry[arry.length - 2];
	}

}
