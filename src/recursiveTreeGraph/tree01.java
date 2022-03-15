package recursiveTreeGraph;

import java.util.Scanner;

public class tree01 {

	public static void main(String[] args) {
		
		/*
		 * 재귀함수
		 * 
		 * 자연수 N이 입력되면 재귀함수를 이용하여 1부터 N까지 출력하는 프로그램 작성.
		 * 
		 * - 입력
		 * 첫 번째 줄은 정수 N이 입력된다.
		 * 
		 * - 출력
		 * 첫 째 줄에 출력한다.
		 * 
		 * ex)
		 * 3 	->	1 2 3
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		DFS(N);
		
	}
	
	public static void DFS(int N) {
		if(N==0) return;
		else {
			// 1 2 3
			DFS(N-1);			
			System.out.print(N + " ");
		
			// 3 2 1
//			System.out.print(N + " ");
//			DFS(N-1);			

		}
		
	}
	
}
