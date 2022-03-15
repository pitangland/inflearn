package twoPointersSlidingWindow;

import java.util.Scanner;

public class two04 {

	public static void main(String[] args) {
		
		/*
		 * 연속 부분수열
		 * 
		 * N개의 수로 이루어진 수열이 주어진다.
		 * 이 수열에서 연속부분수열의 합이 특정숫자 M이 되는 경우가 몇 번 있는지 구하는 프로그램을 작성.
		 * 
		 * - 입력
		 * 첫째 줄에 N, M이 주어짐.
		 * 수열의 원소값은 1,000을 넘지 않는 자연수.
		 * 
		 * - 출력
		 * 첫째 줄에 경우의 수를 출력
		 * 
		 * ex)
		 * 8 6
		 * 1 2 1 3 1 1 1 2  ->  3
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int M = scan.nextInt();
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println(solution(N, M, arr));
		
		scan.close();
		
	}
	
	public static int solution(int N, int M, int[] arr) {
		int answer = 0;
		
		int lt =0;
		int sum = 0;
		
		for(int rt = 0; rt < N; rt++) {
			sum += arr[rt];
			if(sum==M) answer++;
				
				while(sum >= M) {
					sum -= arr[lt++];	//빼고나서 lt 증가
					if(sum == M) answer++;
				}
				
		}
		
		return answer;
	}
	
}
