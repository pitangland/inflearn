package dynamicProgramming;

import java.util.Scanner;

public class dp02 {

	public static void main(String[] args) {
		
		/*
		 * 돌다리 건너기
		 * 학교에 가는데 개울을 만났다.
		 * 개울은 N개의 돌로 다리를 만들어 놓았고
		 * 돌다리를 건널 때 한번에 한칸 또는 두 칸씩 건너뛰면서 돌다리를 건널 수 있다.
		 * 철수가 개울을 건너는 방법은 몇가지?
		 * 
		 * - 입력
		 * 첫째 줄에 돌의 개수인 자연수 N이 주어짐.
		 * 
		 * - 출력
		 * 첫 번째 줄에 개울을 건너는 방법의 수를 출력
		 * 
		 * ex) 7 -> 34
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		System.out.println(solution(N));
		
		scan.close();
		
	}
	
	public static int solution(int N) {
		int answer = 0;
		int[] dy = new int[N+2];
		
		dy[1] = 1;
		dy[2] = 2;
		
		for(int i = 3; i <= N+1; i++) {
			dy[i] = dy[i-2] + dy[i-1];
			answer = dy[N+1];
		}
		
		return answer;
	}
	
}
