package iterator;

import java.util.*;

public class IteratorExample {
	public static void main(String[] args) {
//		List<Integer> list = new ArrayList<Integer>();
		Set<Integer> list = new HashSet<Integer>();

		for (int i = 0; i < 10; i++) {
			list.add(i);
		}

		for (int i = 2; i <= 5; i++) {
			list.add(i);
		}

		System.out.println("size :" + list.size());

		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			int num = iterator.next();
			if (num == 1) {
				iterator.remove();
			}
		}
		System.out.println("size :" + list.size());
	}
}
