package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class array04 {

	public static void main(String[] args) {
		
		/*
		 * 피보나치 수열
		 * 
		 * 1) 피보나치 수열을 출력. 
		 * 	  피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열.
		 * 2) 입력은 피보나치 수열의 총 항의 수, 
		 * 	  만약 7이 입력되면 1 1 2 3 5 8 13 을 출력.
		 * 
		 * - 입력
		 * 첫 줄에 총 항수 N (3 <= N <= 45) 가 입력
		 * 
		 * - 출력
		 * 첫 줄에 피보나치 수열을 출력
		 * 
		 * ex) 10 -> 1 1 2 3 5 8 13 21 34 55
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		for(int result : solution(N)) {
			System.out.print(result + " ");
		}
		
		scan.close();
		
	}
	
	public static int[] solution(int N) {
		int[] answer = new int[N];
		answer[0] = 1;
		answer[1] = 1;
		
		for(int i = 2; i < N; i++) {
			answer[i] = answer[i-2] + answer[i-1];
		}
		
		return answer;
	}
	
	
	
}
