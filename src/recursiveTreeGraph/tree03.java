package recursiveTreeGraph;

import java.util.Scanner;

public class tree03 {

	public static void main(String[] args) {
		
		/*
		 * 팩토리얼
		 * 
		 * 자연수 N이 입력되면 N!를 구하는 프로그램 작성.
		 * 
		 * - 입력
		 * 첫 번째 줄에 자연수 N이 주어짐.
		 * 
		 * - 출력
		 * 첫 번째 줄에 N! 값을 출력.
		 * 
		 * ex)
		 * 5	->	120
		 */
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		System.out.println(DFS(N));
		
		scan.close();
		
	}
	
	public static int DFS(int N) {
		if(N == 1) return 1;
		else return N*DFS(N-1);
	}
	
}
