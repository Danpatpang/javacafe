package collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListBadExample {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(Arrays.asList("a", "b", "c", "d"));
		for (int i = 0; i < list.size(); i++) {
			list.remove(i);
		}
		System.out.println(list);

//		// foreach 문은 내부적으로 반복자를 사용하니까 반복자를 사용해보자.
//		list = new ArrayList<String>(Arrays.asList("a", "a", "a", "a"));
//		for (String str : list) {
//			if (str.equals("a")) {
//				list.remove(str);
//			}
//		}
//		System.out.println(list);

//		// 반복자는 따로 사용.
//		list = new ArrayList<String>(Arrays.asList("a", "a", "a", "a"));
//		Iterator<String> iterator = list.iterator();
//		while (iterator.hasNext()) {
//			String str = iterator.next();
//
//			if (str.equals("a")) {
//				iterator.remove();
//			}
//		}
//		System.out.println(list);
	}
}
