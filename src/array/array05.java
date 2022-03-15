package array;

import java.util.Scanner;

public class array05 {

	public static void main(String[] args) {
		
		/*
		 * 소수 (에라토스테네스 체)
		 * 
		 * 자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램 작성.
		 * 만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개.
		 * 
		 * - 입력
		 * 첫 줄에 자연수의 개수 N (2 <= N <= 200,000) 
		 * 
		 * - 출력 
		 * 첫 줄에 소수의 개수를 출력.
		 * 
		 * ex) 20 -> 8
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		System.out.println(solution(N));
		
		scan.close();
	}
	
	public static int solution(int N) {
		int answer = 0;
		
		int[] ch = new int[N+1];
		
		for (int i = 2; i <= N; i++) {
			if(ch[i] == 0) {
				answer++;
				for (int j = i; j <= N; j=j+i) {
					ch[j] = 1;
				}
			}
		}
		
		return answer;
	}
	
}
