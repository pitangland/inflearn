package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class array02 {

	public static void main(String[] args) throws IOException {
		
		/*
		 * 보이는 학생
		 * 
		 * 선생님이 N명의 학생을 일렬로 세웠습니다.
		 * 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때, 
		 * 맨 앞에 서 있는 선생님이 볼 수 있는 학생의 수를 구하는 프로그램 작성.
		 * (앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않습니다.)
		 * 
		 * - 입력
		 * 첫 줄에 정수 N(5 <= N <= 100,000)이 입력된다. 그 다음 줄에 N명의 학생의 키가 앞에서부터 순서대로 주어진다.
		 * 
		 * - 출력
		 * 선생님이 볼 수 있는 최대학생수를 출력한다.
		 * 
		 * ex) 8
		 * 	   130 135 148 140 145 150 150 153 -> 5
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(solution(N, arr));
		
		br.close();
	}
	
	public static int solution (int N, int[] arr) {
		int answer = 0;
		int max = 0;
		
		for(int i = 0; i < N; i++) {
			if(max < arr[i]) {
				answer++;
				max = arr[i];
			}
			
		}
		
		return answer;
	}
	
}
