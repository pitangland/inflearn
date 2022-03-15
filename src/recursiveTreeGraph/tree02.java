package recursiveTreeGraph;

import java.util.Scanner;

public class tree02 {

	public static void main(String[] args) {
		
		/*
		 * 재귀함수를 이용한 이진수 출력
		 * 
		 * 10진수 N이 입력되면 2진수로 변환하여 출력하는 프로그램을 작성.
		 * 단, 재귀함수를 이용해서 출력.
		 * 
		 * - 입력
		 * 첫 번째 줄에 10진수 N이 주어짐.
		 * 
		 * - 출력
		 * 첫 번째 줄에 이진수를 출력.
		 * 
		 * ex)
		 * 11	->	1011
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		DFS(N);
		
		scan.close();
		
	}
	
	public static void DFS (int N) {
		if(N == 0) return;
		else {
			DFS(N/2);
			System.out.print(N%2);
		}
		
	}
	
}
