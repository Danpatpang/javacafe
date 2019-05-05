package collection.set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample3 {
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("apple");
		treeSet.add("forever");
		treeSet.add("description");
		treeSet.add("ever");
		treeSet.add("zoo");
		treeSet.add("door");

		System.out.println("c-f 사이의 단어 검색");
		// headSet, tailSet, subSet
		NavigableSet<String> rangeSet = treeSet.subSet("c", true, "f", true);
		for (String str : rangeSet) {
			System.out.println(str);
		}
	}
}
