package com.learning.test;

import java.util.stream.Stream;

public class StoneTest {

	public static void main(String[] args) {
		int count = getCount1("adcD", "abcdDasd");
		int count2 = getCount2("adcD", "abcdDasd");
		System.out.println(count);
		System.out.println(count2);
	}

	public static int getCount1(String J, String S) {
		int count = 0;
		if ((J == null || S == null) || ("".equals(J) || "".equals(S))) {
			return count;
		}
		char[] cjarr = J.toCharArray();
		char[] csarr = S.toCharArray();
		for (int j = 0; j < cjarr.length; j++) {
			for (int s = 0; s < csarr.length; s++) {
				if (cjarr[j] == csarr[s]) {
					count++;
				}
			}
		}
		return count;
	}

	public static int getCount2(String J, String S) {
		int result = 0;
		for (int i = 0; i < S.length(); i++) {
			if (J.indexOf(S.charAt(i)) != -1) {
				result++;
			}
		}
		return result;
	}

	public static boolean checkNum(String s) {
		boolean isNum = false;
		if (s == null || "".equals(s)) {
			return isNum;
		}

		return isNum;
	}

	public static int getCount3(String J, String S) {
		int count = 0;
		Stream<Character> sstream = S.codePoints().mapToObj(c -> (char) c);
		return count;
	}

}
