package q10871;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		sc.close();

//		System.out.println(N + " " + X);
//		for (int i = 0; i < N; i++) {
//			System.out.print(A[i] + " ");
//		}
//		System.out.println();

		for (int i = 0; i < N; i++) {
			if (A[i] < X) {
				System.out.print(A[i] + " ");
			}
		}
	}
}
