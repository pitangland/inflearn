package twoPointersSlidingWindow;

import java.util.Scanner;

public class two03 {

	public static void main(String[] args) {
		
		/*
		 * 최대 매출
		 * 
		 * N일 동안의 매출기록을 주고 연속된 K일 동안의 최대 매출액이 얼마인지 구하라고 함.
		 * 만약 N=10 이고 10일간의 매출기록이 아래와 같다면,
		 * 이때 K=3 이면 12 15 11 20 25 10 20 19 13 15 
		 * 연속된 3일간의 최대 매출액은 11+20+25 =56만원이다.
		 * 
		 * - 입력
		 * 첫 줄에 N과 K가 주어짐.
		 * 두 번째 줄에 N개의 숫자열이 주어짐. 각 숫자는 500이하의 음이 아닌 정수
		 * 
		 * ex)
		 * 10 3
		 * 12 15 11 20 25 10 20 19 13 15  ->  56
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int K = scan.nextInt();
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println(solution(N, K, arr));
		
		scan.close();
		
	}
	
	public static int solution (int N, int K, int[] arr) {
		int answer = 0;
		int sum = 0;
		for(int i = 0; i < K; i++) {
			sum += arr[i];
		}
		answer = sum;
		
		for(int i = K; i < N; i++) {
			sum += arr[i]-arr[i-K];
			if(answer < sum) {
				answer = sum;
			}
		}
		
		return answer;
	}
	
}
