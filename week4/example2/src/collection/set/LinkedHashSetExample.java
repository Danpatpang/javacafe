package collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<String>();

		set.add("보라돌이");
		set.add("뚜비");
		set.add("나나");
		set.add("뽀");
//		set.add("보라돌이");

		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());

		}
	}
}
