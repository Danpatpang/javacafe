package condition;

public class ConditionExam01 {
	public static void main(String[] args) {
		int age = 22;
		if (age >= 20 && age < 50) {
			System.out.println("청년");
		} else if (age < 20) {
			System.out.println("청소년");
		} else {
			System.out.println("마음은 청년");
		}

		age = 33;
		if (age >= 20 && age < 50) {
			if (age < 30) {
				System.out.println("청년");
			} else {
				System.out.println("청년2");
			}
		} else if (age < 20) {
			System.out.println("청소년");
		} else {
			System.out.println("마음은 청년");
		}
	}
}