package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsExample2 {
	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
		list.add(new Person("smith", 25));
		list.add(new Person("bob", 25));
		list.add(new Person("kong", 29));
		list.add(new Person("smith", 21));

		System.out.println("현재 인원");
		for (Person p : list) {
			System.out.println(p.name + " " + p.age);
		}

		Collections.sort(list);
//		Collections.sort(list, new Comparator<Person>() {
//			@Override
//			public int compare(Person o1, Person o2) {
//				return o1.age - o2.age;
//			}
//		});

//		Collections.sort(list, ((o1, o2) -> o1.age - o2.age));

		System.out.println("정렬된 인원");
		for (Person p : list) {
			System.out.println(p.name + " " + p.age);
		}

		Collections.shuffle(list);
		System.out.println("섞은 인원");
		for (Person p : list) {
			System.out.println(p.name + " " + p.age);
		}

		System.out.println("인원 찾기");
		System.out.println(Collections.frequency(list, new Person("smith", 25)));

//		Person p = new Person("danpatpang", 10);
//		list.add(p);
//		System.out.println(Collections.frequency(list, p));
	}
}

//class Person {
//	public String name;
//	public int age;
//
//	Person(String name, int age) {
//		this.name = name;
//		this.age = age;
//	}
//}

class Person implements Comparable<Person>{
	public String name;
	public int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public int compareTo(Person p) {
		return this.age - p.age;
	}
}