package loop;

public class LoopExam02 {
	public static void main(String[] args) {
		// 구구단 출력
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + "*" + j + "=" + (i * j) + " ");
			}
			System.out.println();
		}

		System.out.println("========================================");


//		// 3단까지만 출력
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= 9; j++) {
//				System.out.print(i + "*" + j + "=" + i * j + " ");
//			}
//			System.out.println();
//			if (i == 3) {
//				break;
//			}
//		}
//
//		System.out.println("========================================");
//
//
//		// 3단 빼고 출력
//		for (int i = 1; i <= 5; i++) {
//			if (i == 3) {
//				continue;
//			}
//			for (int j = 1; j <= 9; j++) {
//				System.out.print(i + "*" + j + "=" + i * j + " ");
//			}
//			System.out.println();
//		}
//
//		System.out.println("========================================");
//
//
//		// 3 나오면 다 끝내
//		first:
//		for (int i = 1; i <= 5; i++) {
//			second:
//			for (int j = 1; j <= 9; j++) {
//				if (j == 3) {
//					break first;
//				}
//				System.out.print(i + "*" + j + "=" + i * j + " ");
//			}
//			System.out.println();
//		}

	}
}
