package dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class dy05 {

	public static void main(String[] args) throws IOException {
		
		/*
		 * 동전교환(냅색 알고리즘)
		 * 다음과 같이 여러단위의 동전들이 주어져 있을 때 거스름돈을 가장 적은 수의 동전으로 교환해주려면 어떻게 주면 되는가?
		 * 각 단위의 동전은 무한정 쓸 수 있다.
		 * 
		 * - 입력
		 * 첫 번째 줄에는 동전의 종류개수 N이 주어짐.
		 * 두 번째 줄에는 N개의 동전의 종류가 주어지고, 그 다음줄에 거슬러 줄 금액 M이 주어짐.
		 * 각 동전의 종류는 100원을 넘지 않는다.
		 * 
		 * - 출력
		 * 첫 번째 줄에 거슬러 줄 동전의 최소개수를 출력.
		 * 
		 * ex)
		 * 3
		 * 1 2 5
		 * 15		->		3
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		// 엔터 후에도 StringTokenizer 를 쓰고 싶다면 for문 안에 생성.
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int M = Integer.parseInt(br.readLine());
		
		System.out.println(solution(N, M, arr));
		 
		br.close();
		
	}
	
	public static int solution(int N, int M, int[] arr) {
		int answer = 0;
		
		int[] dy = new int[M+1];
		
		// dy배열을 큰 숫자로 일단 초기화.
		Arrays.fill(dy, Integer.MAX_VALUE);
		dy[0] = 0;
		
		for(int i = 0; i < N; i++) {
			for(int j = arr[i]; j <= M; j++) {
				dy[j] = Math.min(dy[j], dy[j-arr[i]]+1);
			}
			answer = dy[M];
		}
		
		return answer;
	}
	
}












