package loop;

public class LoopExam01 {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			System.out.print(i + " ");
		}

		System.out.println();

		for (int i = 1; i <= 9; i+=2) {
			System.out.print(i + " ");
		}

		System.out.println();

		int y = 1;
		for (; y <= 9; y++) {
			System.out.print(y + " ");
		}

//		System.out.println();

//		for (; ;) {
//			System.out.println("loop");
//		}

		System.out.println();

		// foreach
		int[] list = {1, 2, 3, 4, 5};
		for (int i: list) {
			System.out.print(i + " ");
		}
	}
}
