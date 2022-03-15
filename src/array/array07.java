package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class array07 {

	public static void main(String[] args) throws IOException {
		
		/*
		 * 점수 계산
		 * 
		 * 여러 개의 OX문제로 만들어진 시험에서 연속적으로 답을 맞히는 경우에는 가산점을 주기위해 점수계산을 하기로 함.
		 * 1번 문제가 맞는 경우 1점, 앞의 문제에 대해서는 답을 틀리다가 답을 맞는 처음 문제는 1점으로 계산.
		 * 또한, 연속으로 문제의 답이 맞는 경우 두번째 문제에는 2점, 세번째는 3점, K번째 문제는 K점으로 계산. 틀린문제는 0점.
		 * 시험문제의 채점 결과가 주어졌을 때, 총 점수를 계산하는 프로그램 작성.
		 * 
		 * - 입력 
		 * 첫째 줄에 문제의 개수 N(1 <= N <= 100)이 주어진다.
		 * 둘째 줄에는 N개 문제의 채점 결과를 나타내는 0 혹은 1이 빈 칸을 사이에 두고 주어진다.
		 * 0은 문제의 답이 틀린 경우, 1은 문제의 답이 맞는 경우.
		 * 
		 * - 출력
		 * 첫째 줄에 입력에서 주어진 채점 결과에 대하여 가산점을 고려한 총 점수를 출력
		 * 
		 * ex) 10
		 * 	   1 0 1 1 1 0 0 1 1 0 -> 10
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
		int cnt = 0;
		
		for(int i = 0; i < N; i++) {
			if(arr[i] == 1) {
				cnt++;
				answer += cnt;
			} else {
				cnt = 0;
			}
		}
		
		return answer;
	}
	
}
