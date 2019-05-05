package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i <= 4; i++) {
			list.add(i);
		}
		list.add(1);
		list.add(1);
		list.add(3);

		System.out.println("목록 : " + list);

		Collections.shuffle(list);
		System.out.println("섞기 : " + list);

		Collections.reverse(list);
		System.out.println("뒤집기 :" + list);

		Collections.sort(list);
		System.out.println("오름차순 :" + list);

		int index = Collections.binarySearch(list, 1);
		System.out.println("이진 탐색 :" + index);

		int frequency = Collections.frequency(list, 1);
		System.out.println("1의 출현 횟수 :" + frequency);
	}
}
