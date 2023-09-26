package q2588;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();

		System.out.println(num1);
		System.out.println(num2);
		
		// case 1 -------------------------
		int h = num2 / 100;
//		System.out.println(h);
		
		int t = num2 % 100 / 10;
//		System.out.println(t);
		
		int o = num2 % 10;
//		System.out.println(o);
		
		System.out.println(num1 * o);
		System.out.println(num1 * t);
		System.out.println(num1 * h);
		System.out.println(num1 * num2);
	}
}
