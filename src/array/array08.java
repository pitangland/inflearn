package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class array08 {

	public static void main(String[] args) throws IOException {
		
		/*
		 * 등수 구하기
		 * 
		 * N명의 학생의 국어점수가 입력되면 각 학생의 등수를 입력된 순서대로 출력하는 프로그램 작성.
		 * 같은 점수가 입력될 경우 높은 등수로 동일 처리한다.
		 * 즉, 가장 높은 점수가 92-> 3명 존재하면 1등이 3명이고 그 다음 학생은 4등이 된다.
		 * 
		 * - 입력
		 * 첫 줄에 N(3 <= N <= 100) 이 입력되고, 두번째 줄에 국어점수를 의미하는 N개의 정수가 입력.
		 * 
		 * - 출력
		 * 입력된 순서대로 등수를 출력.
		 * 
		 * ex) 5
		 * 	   87 89 92 100 76 -> 4 3 2 1 5
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int result : solution(N, arr)) {
			System.out.print(result + " ");
		}
		
		br.close();
		
	}
	
	public static int[] solution(int N , int[] arr) {
		int[] answer = new int[N];
		
		for(int i = 0; i < N; i++) {
			int cnt = 1;
			for(int j = 0; j < arr.length; j++) {
				if(arr[j] > arr[i]) cnt++;
			}
			answer[i] = cnt;
		}
		
		return answer;
	}
	
}
