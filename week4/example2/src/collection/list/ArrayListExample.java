package collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		String[] array = {"보라돌이", "뚜비", "나나", "뽀"};
		List<String> list = Arrays.asList(array);

//		List<String> list = new ArrayList<String>();
//
//		list.add("보라돌이");
//		list.add("뚜비");
//		list.add("나나");
//		list.add("뽀");
//		list.add(0, "청소기");

		int size = list.size();
		System.out.println("총 객체 수 : " + size);
		System.out.println("/////");

		boolean isContainsNana = list.contains("나나");
		System.out.println("나나 있니? " + isContainsNana);
		System.out.println("/////");

		String name = list.get(1);
		System.out.println("1번 인덱스에는 누구? " + name);
		System.out.println("/////");

		for (String n : list) {
			System.out.println(n);
		}
		System.out.println("/////");

		list.remove(2);
		list.remove(2);
		for (String n : list) {
			System.out.println(n);
		}
		System.out.println("/////");

		list.remove("보라돌이");

		for (String n : list) {
			System.out.println(n);
		}
	}
}
