package array;

import java.io.IOException;
import java.util.Scanner;

public class array09 {

	public static void main(String[] args) throws IOException {
		
		/*
		 * 격자판 최대합
		 * 
		 * 5*5 격자판에 숫자가 적혀있다.
		 * N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가장 큰 합을 출력
		 * 
		 * - 입력
		 * 첫 줄에 자연수 N이 주어진다. (2 <= N <= 50)
		 * 두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 
		 * 각 자연수는 100을 넘지 않는다.
		 * 
		 * - 출력
		 * 최대합을 출력한다.
		 * 
		 * ex) 5
		 * 	   10 13 10 12 15
		 * 	   12 39 30 23 11
		 * 	   11 25 50 53 15
		 * 	   19 27 29 37 27
		 * 	   19 13 30 13 19	-> 155
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int[][] arr = new int[N][N];
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		System.out.println(solution(N,arr));
		
		scan.close();
		
	}
	
	public static int solution (int N, int[][] arr) {
		int answer = Integer.MIN_VALUE;
		
		int sum1, sum2; //행의 합, 열의 합 
		
		//행과 열 중 최소값
		for(int i = 0; i < N; i++) {
			sum1=sum2 = 0;
			for(int j = 0; j < N; j++) {
				sum1 += arr[i][j];
				sum2 += arr[j][i];
			}
			answer=Math.max(answer, sum1);
			answer=Math.max(answer, sum2);
		}
		
		sum1=sum2 = 0;
		for(int i = 0; i < N; i++) {
			sum1 += arr[i][i];
			sum2 += arr[i][N-i-1];
		}
		
		answer=Math.max(answer, sum1);
		answer=Math.max(answer, sum2);
		
		return answer;
	}
	
}
