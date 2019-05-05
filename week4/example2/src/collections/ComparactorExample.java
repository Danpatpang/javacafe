package collections;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparactorExample {
	public static void main(String[] args) {
		TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new Comparator<Fruit>() {
			@Override
			public int compare(Fruit o1, Fruit o2) {
				return o1.price - o2.price;
			}
		});

		treeSet.add(new Fruit("사과", 3000));
		treeSet.add(new Fruit("배", 4000));
		treeSet.add(new Fruit("오렌지", 1000));

		for(Fruit f : treeSet) {
			System.out.println(f.name + " " + f.price);
		}
	}
}

class Fruit {
	public String name;
	public int price;

	Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}
}