package condition;

public class ConditionExam02 {
	public static void main(String[] args) {
		// int 형으로 조건 지정
		int i = 2;

		switch (i) {
			case 1:
				System.out.println("Num is 1.");
				break;
			case 2:
				System.out.println("Num is 2.");
				break;
			case 3:
				System.out.println("Num is 3.");
				break;
			default:
				System.out.println("No Num");
				break;
		}

		// char 형으로 조건 지정
		char c = '나';
		switch (c) {
			case 'A':
				System.out.println("Literal is A.");
				break;
			case '가':
				System.out.println("Literal is 가.");
				break;
			case 'a':
				System.out.println("Literal is a.");
				break;
			default:
				System.out.println("No matching.");
				break;
		}

	}
}
