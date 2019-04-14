package scanner;

import java.util.Scanner;

public class ScannerExam02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		String str;

		System.out.print("num 입력 : ");
		num = scan.nextInt();
		System.out.print("str 입력 : ");
		str = scan.nextLine();

		System.out.println();
		System.out.println("num : " + num);
		System.out.println("str : " + str);

		scan.close();
	}
}
