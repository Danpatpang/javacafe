package map;

import java.util.Map;
import java.util.TreeMap;

public class HashtableExample {
	public static void main(String[] args) {
		Bottle b1 = new Bottle("red", 15);
		Bottle b2 = new Bottle("black", 10);
		Bottle b3 = new Bottle("white", 20);
		Bottle b4 = new Bottle("green", 10);
//		Bottle b4 = new Bottle("red", 10);
//		Bottle b4 = new Bottle("red", 11);

		TreeMap<Bottle, Integer> treeMap = new TreeMap<Bottle, Integer>();
		treeMap.put(b1, 10);
		treeMap.put(b2, 15);
		treeMap.put(b3, 5);
		treeMap.put(b4, 20);

		for (Map.Entry<Bottle, Integer> entry : treeMap.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
	}
}

class Bottle implements Comparable<Bottle> {
	String name;
	int size;

	Bottle(String name, int size) {
		this.name = name;
		this.size = size;
	}

	@Override
	public int compareTo(Bottle o) {
		return this.size - o.size;
	}

	@Override
	public String toString(){
		return name + " bottle";
	}
}