package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class array06 {

	public static void main(String[] args) throws IOException {
		
		/*
		 * 뒤집은 소수
		 * 
		 * N개의 자연수가 입력되면 각 자연수를 뒤집은 후, 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램 작성.
		 * 예를들어, 32를 뒤집으면 23이고 23은 소수. -> 23을 출력
		 * 단, 910을 뒤집으면 19로 숫자화. 첫 자리부터의 연속된 0은 무시.
		 * 
		 * - 입력
		 * 첫 줄에 자연수의 개수 N(3 <= N <= 100)이 주어지고, 그 다음 줄에 N개의 자연수가 주어진다.
		 * 각 자연수의 크기는 100,000을 넘지 않는다.
		 * 
		 * - 출력
		 * 첫 줄에 뒤집은 소수를 출력. 출력순서는 입력된 순서대로 출력
		 * 
		 * ex)
		 * 9
		 * 32 55 62 20 250 370 200 30 100 -> 23 2 73 2 3
		 * 
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
	
	public static List<Integer> solution(int N, int[] arr) {
		List<Integer> answer = new ArrayList<>();
		
		for (int i = 0; i < N; i++) {
			int tmp = arr[i];
			int res = 0;
			while(tmp > 0) {
				int t = tmp%10;
				res = res*10 + t;
				tmp = tmp/10;
			}
			if(isPrime(res)) answer.add(res);
		}
		
		return answer;
	}
	
	// 소수인지 아닌지 판별
	public static boolean isPrime(int num) {
		if(num == 1) return false;
		for(int i = 2; i < num; i++) {
			if(num%i == 0) {
				return false;
			} 
		}
		return true;
	}
	
}
