package recursiveTreeGraph;

import java.util.Scanner;

public class tree04 {

	static int[] fibo;
	
	public static void main(String[] args) {
		
		/*
		 * 피보나치 수열
		 * 
		 * 피보나치 수열을 출력. 
		 * 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열.
		 * 입력은 피보나치 수열의 총 항의 수. 
		 * 
		 * - 입력
		 * 첫 줄에 총 항수 N이 입력.
		 * 
		 * - 출력
		 * 첫 줄에 피보나치 수열을 출력.
		 * 
		 * ex)
		 * 10	-> 1 1 2 3 5 8 13 21 34 55
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		fibo = new int[N+1];
		
		DFS(N);
		for(int i = 1; i <= N; i++) {
			System.out.print(fibo[i] + " ");			
		}
		
		scan.close();
		
	}
	
	public static int DFS(int N) {
		if(fibo[N] > 0) return fibo[N];
		if(N == 1) return fibo[N] = 1;
		else if (N == 2) return fibo[N] = 1;
		else return fibo[N] = DFS(N-2) + DFS(N-1);
	}
	
}
