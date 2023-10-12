package q9012;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			String inp = sc.next();

			int cnt = 0;
			for (int j = 0; j < inp.length(); j++) {
				if (inp.charAt(j) == '(') {
					cnt--;
				} else {
					cnt++;
					if(cnt > 0) {
						break;
					}
				}
			}

			if (cnt == 0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		sc.close();
	}
}
