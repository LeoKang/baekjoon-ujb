package q8958;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
//		System.out.println(T);

		for (int t = 0; t < T; t++) {
			String score = sc.next();
//			System.out.println(score);

			int sum = 0, cnt = 1;
			for (int i = 0; i < score.length(); i++) {
				if(score.charAt(i) == 'O') {
					sum += cnt++;
				}else {				// 'X'
					cnt = 1;
				}
			}
			System.out.println(sum);
		}
		sc.close();
	}
}
