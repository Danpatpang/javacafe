package type;

public class TypeExam02 {
	public static void main(String[] args) {
		String s1 = "Cat";
		String s2 = "Cat";
		String s3 = new String("Cat");
//		char[] charArray = {'C', 'a', 't'};
//		String s4 = new String(charArray);

		System.out.println(s1 == s2);
		System.out.println(s1 == s3);

		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
	}
}
