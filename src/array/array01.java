package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class array01 {

	public static void main(String[] args) throws IOException {
		
		/*
		 * 큰 수 출력하기
		 * 
		 * N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램 작성
		 * (첫 번째 수는 무조건 출력)
		 * 
		 * - 입력
		 * 첫 줄에 자연수 N(1 <= N <= 100)이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.
		 * 
		 * - 출력
		 * 자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다.
		 * 
		 * ex) 6
		 * 	   7 3 9 5 6 12 -> 7 9 6 12
		 * 
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < N; i++) {
			arr[i] = (Integer.parseInt(st.nextToken()));
		}
		
		for(int result : solution(N, arr)) {
			System.out.print(result + " ");
		}
		
		br.close();
		
	}
	
	public static List<Integer> solution (int N, int[] arr) {
		List<Integer> answer = new ArrayList<>();
		
		int max = 0;
		
		for(int i = 0; i < N; i++) {
			if (max < arr[i]) {
				answer.add(arr[i]);
			}
			max = arr[i];
		}
		
		return answer;
	}
	
}
