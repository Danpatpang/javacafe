package collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();

		set.add(new Member("보라돌이"));
		set.add(new Member("나나"));
		set.add(new Member("뚜비"));
		set.add(new Member("뽀"));
//		set.add(new Member("보라돌이"));

		Iterator<Member> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next().name);
		}
	}
}
