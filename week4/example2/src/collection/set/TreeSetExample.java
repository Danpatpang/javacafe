package collection.set;

import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		scores.add(new Integer(80));
		scores.add(new Integer(90));
		scores.add(new Integer(70));
		scores.add(new Integer(100));
//		scores.add(new Integer(null));

		Integer score = null;
		score = scores.first();
		System.out.println("가장 낮은 점수 " + score);

		score = scores.last();
		System.out.println("가장 높은 점수 " + score);
		score = scores.lower(85);
		System.out.println("85점 바로 아래 점수 " + score);

		score = scores.higher(80);
		System.out.println("80점 바로 위 점수 " + score);

		score = scores.floor(85);
		System.out.println("85점 바로 이하인 점수 " + score);

		score = scores.ceiling(80);
		System.out.println("80점 바로 이상인 점수 " + score);
	}
}
