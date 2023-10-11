package q10845;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> q = new LinkedList<Integer>();
		
		try {
			int N = Integer.parseInt(br.readLine());
			System.out.println(N);

			for (int i = 0; i < N; i++) {
				String inp = br.readLine();
				StringTokenizer st = new StringTokenizer(inp);
				String cmd = "";
				int num = 0;
				if (st.countTokens() == 2) {
					cmd = st.nextToken();
					num = Integer.parseInt(st.nextToken());
				} else {
					cmd = st.nextToken();
				}
//				System.out.println(cmd + " " + num);
				
				switch(cmd) {
				case "push":
					System.out.println("push");
					q.offer(num);
					break;
				case "pop":
					System.out.println("pop");
					System.out.println(q.poll());
					break;
				case "size":
					System.out.println("size");
					System.out.println(q.size());
					break;
				case "empty":
					System.out.println("empty");
					System.out.println(q.isEmpty());
					break;
				case "front":
					System.out.println("front");
					System.out.println(q.peek());
					break;
				case "back":
					System.out.println("back");
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
