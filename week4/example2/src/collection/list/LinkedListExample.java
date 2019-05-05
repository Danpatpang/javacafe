package collection.list;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class LinkedListExample {
	static List<String> list1;
	static List<String> list2;
	static List<String> list3;
	static long startTime, endTime;

	public static long addTime(List<String> list) {
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list.add(String.valueOf(i));
//			list.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		return (endTime - startTime);
	}

	public static long search(List<String> list) {
		startTime = System.nanoTime();
		list.contains("5000");
		list.contains("1");
		list.contains("7777");
		list.contains("1000");
		list.contains("300");
		list.contains("0");
		list.contains("9999");
		endTime = System.nanoTime();
		return (endTime - startTime);
	}

	public static void main(String[] args) {
		list1 = new ArrayList<String>();
		list2 = new Vector<String>();
		list3 = new LinkedList<String>();

		// add, remove
		long time = addTime(list1);
		System.out.println("ArrayList 걸린 시간 : " + time + "ns");
		time = addTime(list2);
		System.out.println("Vector 걸린 시간 : " + time + "ns");
		time = addTime(list3);
		System.out.println("LinkedList 걸린 시간 : " + time + "ns");

		//search
		time = search(list1);
		System.out.println("ArrayList 걸린 시간 : " + time + "ns");
		time = search(list2);
		System.out.println("Vector 걸린 시간 : " + time + "ns");
		time = search(list3);
		System.out.println("LinkedList 걸린 시간 : " + time + "ns");
	}
}
