package twoPointersSlidingWindow;

import java.util.Scanner;

public class two05 {

	public static void main(String[] args) {
		
		/*
		 * 연속된 자연수의 합
		 * 
		 * N입력으로 양의 정수 N이 입력되면 2개 이상의 연속된 자연수의 합으로 N을 표현하는 방법의 가짓수를 출력하는 프로그램 작성.
		 * 
		 * - 입력
		 * 첫 번째 줄에 양의 정수 N(7<=N<1000).
		 * 
		 * - 출력
		 * 첫 줄에 총 경우수를 출력.
		 * 
		 * ex) 15  ->  3
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		System.out.println(solution(N));
		
		scan.close();
		
	}
	
	public static int solution(int N) {
		int answer = 0;
		int sum = 0; 
		int lt = 0;
		int M = N/2 +1;
		int[] arr = new int[M];
		
		for(int i = 0; i < M; i++) {
			arr[i] = i+1;
		}
		
		for(int rt = 0; rt < M; rt++) {
			sum += arr[rt];
			if(sum == N) answer++;
			
			while(sum >= N) {
				sum -= arr[lt++];
				if(sum == N) answer++;
			}
		}
		
		return answer;
	}
	
	public static int solution2(int N) {
		int answer = 0, cnt = 1;
		N--;
		while(N > 0) {
			cnt++;
			N = N-cnt;
			if(N%cnt == 0)  answer++;
		}
		return answer;
	}
	
}
