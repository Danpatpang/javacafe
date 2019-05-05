package array;

import java.util.Arrays;

public class ArrayExam01 {
	public static void main(String[] args) {
		int[] a = {5, 4, 3, 2, 1};
		int b[] = new int[5];

		int c[];
//		c = {1, 2, 3, 4, 5};
		c = new int[] {1, 2, 3, 4, 5};

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.println();

		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.println();

		Arrays.fill(a, 100);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+ " ");
		}
	}
}
