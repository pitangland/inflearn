package dynamicProgramming;

import java.util.Scanner;

public class dp01 {

	public static void main(String[] args) {
		
		/*
		 * 계단 오르기
		 * 철수는 계단을 오를 때 한번에 한 계단 또는 두 계단 씩 올라간다.
		 * 만약 총 4계단을 오른다면 그 방법의 수는
		 * 1+1+1+1, 1+1+2, 1+2+1, 2+1+1, 2+2 로 5가지이다.
		 * 그렇다면 총 N계단일 때 철수가 올라갈 수 있는 방법의 수는 몇가지?
		 * 
		 * - 입력
		 * 첫째 줄은 계단의 개수인 자연수 N이 주어짐.
		 * 
		 * - 출력
		 * 첫 번째 줄에 올라가는 방법의 수를 출력.
		 * 
		 * ex)
		 * 7 -> 21
		 */
		
		/*
		 * 동적계획법
		 * 큰 문제가 있으면 작은 문제로 나누어 푸는 것.
		 * 작은 문제의 답 -> 큰 문제를 해결. 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		System.out.println(solution(N));
		
		scan.close();
		
	}
	
	public static int solution(int N) {
		int answer = 0;
		
		// 방법의 수 (즉, 작은 문제의 답을 하나하나 배열에 넣어놓기)
		int[] dy = new int[N+1];
		dy[1] = 1;
		dy[2] = 2;
		
		for(int i = 3; i <= N; i++) {
			dy[i] = dy[i-2] + dy[i-1];
			answer = dy[N];
		}
		
		return answer;
	}
	
}
