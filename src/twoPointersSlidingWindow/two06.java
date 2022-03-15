package twoPointersSlidingWindow;

import java.util.Scanner;

public class two06 {

	public static void main(String[] args) {
		
		/*
		 * 최대 길이 연속부분수열
		 * 
		 * 0과 1로 구성된 길이가 N인 수열이 주어짐.
		 * 이 수열에서 최대 k번을 0을 1로 변경할 수 있다.
		 * 여러분이 최대 k번의 변경을 통해 이 수열에서 1로만 구성된 최대 길이의 연속부분수열을 찾는 프로그램을 작성하세요.
		 * 
		 * - 입력
		 * 첫 번째 줄에 수열의 길이인 자연수 N이 주어진다.
		 * 두 번째 줄에 N길이의 0과 1로 구성된 수열이 주어짐.
		 * 
		 * - 출력
		 * 첫 줄에 최대 길이를 출력.
		 * 
		 * ex)
		 * 14 2
		 * 1 1 0 0 1 1 0 1 1 0 1 1 0 1  ->  8
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
	
	public static int solution(int N, int K, int[] arr) {
		int answer = 0;
		int cnt = 0;
		int lt = 0;
		
		for(int rt = 0; rt < N; rt++) {
			if(arr[rt] == 0) cnt++;
			while(cnt > K) {
				if(arr[lt] == 0) cnt--;
				lt++;
			}
			answer = Math.max(answer, rt-lt+1);
		}
		
		return answer;
	}
	
}
