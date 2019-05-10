package collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class PerformanceEvaluation {

	public static long addTime(Set<Integer> set) {
		long startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			set.add(i);
		}
		long endTime = System.nanoTime();
		return (endTime - startTime);
	}

	public static long search(Set<Integer> set) {
		long startTime = System.nanoTime();
		set.contains("5000");
		set.contains("1");
		set.contains("7777");
		set.contains("1000");
		set.contains("300");
		set.contains("0");
		set.contains("9999");
		long endTime = System.nanoTime();
		return (endTime - startTime);
	}

	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new TreeSet<Integer>();
		Set<Integer> set3 = new LinkedHashSet<Integer>();

		// 삽입 측정
//		System.out.println("HashSet : " + addTime(set1) + "       " + search(set1));
//		System.out.println("TreeSet : " + addTime(set2) + "       " + search(set1));
//		System.out.println("LinkedHashSet : " + addTime(set3) + "       " + search(set1));

	}
}
