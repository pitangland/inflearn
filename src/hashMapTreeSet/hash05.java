package hashMapTreeSet;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class hash05 {

	public static void main(String[] args) {
		
		/*
		 * K번째 큰 수
		 * 
		 * 1부터 100사이의 자연수가 적힌 N의 카드를 가지고 있다. 같은 숫자가 여러장 있을 수 있다.
		 * 현수는 이 중 3장을 뽑아 각 카드에 적힌 수를 합한 값을 기록하려고 한다. 3장을 뽑을 수 있는 모든 경우를 기록.
		 * 기록한 값 중 K번째로 큰 수를 출력하는 프로그램 작성.
		 * 만약 큰 수부터 만들어진 수가 25 25 23 23 22 20 19... 이고 K값이 3이라면 큰 값은 22.
		 * 
		 * - 입력
		 * 첫 줄에 자연수 N과 K가 입력되고, 그 다음 줄에 N개의 카드값이 입력된다.
		 * 
		 * - 출력
		 * 첫 줄에 K번째 수를 출력. K번째 수가 존재하지 않으면 -1을 출력.
		 * 
		 * ex)
		 * 10 3
		 * 13 15 34 23 45 65 33 11 26 42  ->  143
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int K = scan.nextInt();
		
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println(solution(N, K, arr));
		
		scan.close();
		
	}
	
	public static int solution(int N, int K, int[] arr) {
		int answer = -1;
		
		// Collections.reverseOrder() -> 내림차순으로 자동 정리
		TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
		
		for(int i = 0; i < N; i++) {
			for(int j = i+1; j < N; j++) {
				for(int l = j+1; l < N; l++) {
					set.add(arr[i]+arr[j]+arr[l]);
				}
			}
		}
		
		int cnt = 0;
		for(int x : set) {
			cnt++;
			if(cnt == K) return x;
		}
		
		return answer;
	}
	
}
