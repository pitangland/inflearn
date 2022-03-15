package recursiveTreeGraph;

import java.util.Scanner;

public class tree06 {

	public static void main(String[] args) {
		
		/*
		 * 부분집합 구하기(DFS)
		 * 
		 * 자연수 N이 주어지면 1부터 N까지의 원소를 갖는 집합의 부분집합을 모두 출력하는 프로그램 작성.
		 * 
		 * - 입력
		 * 첫 번째 줄에 자연수 N이 주어진다.
		 * 
		 * - 출력
		 * 첫 번째 줄부터 각 줄에 하나씩 부분집합을 아래와 출력예제와 같은 순서로 출력.
		 * 단, 공집합은 출력하지 않는다.
		 * 
		 * ex)
		 * 3	-> 	1 2 3
		 * 			1 2
		 * 			1 3	
		 * 			1
		 * 			2 3
		 * 			2
		 * 			3
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		DFS(1);
		
		scan.close();
		
	}
	
	public static void DFS(int N) {
		int[] ch = new int[N+1];	// 체크배열
		
		if(N == N+1) {
			String tmp = "";
			for(int i = 1; i <= N; i++) {
				if(ch[i] == 1) tmp += (i+" ");
			}
			if(tmp.length() > 0) System.out.println(tmp);
		} else {
			ch[N] = 1;
			DFS(N+1);
			ch[N] = 0;
			DFS(N+1);
		}
	}
	

}
