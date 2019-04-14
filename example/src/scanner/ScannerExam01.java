package scanner;

import java.util.Scanner;

public class ScannerExam01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String str1 = scan.nextLine();
		String str2 = scan.next();
		int str3 = scan.nextInt();

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);

		scan.close();
	}
}
