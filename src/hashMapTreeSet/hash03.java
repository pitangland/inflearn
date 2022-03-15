package hashMapTreeSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class hash03 {

	public static void main(String[] args) {
		
		/*
		 * 매출액의 종류
		 * 
		 * 현수아빠는 현수에게 N일 동안의 매출기록을 주고 연속된 K일 동안의 매출액의 종류를 각 구간별로 구하라고 함.
		 * N일간의 매출기록과 연속구간의 길이 K가 주어지면 첫 번째 구간부터 각 구간별
		 * 매출액의 종류를 출력하는 프로그램 작성.
		 * 
		 *  - 입력
		 *  첫 줄에 N과 K가 주어진다.
		 *  두 번째 줄에 N개의 숫자열이 주어진다. 각 숫자는 500이하의 음이 아닌 정수.
		 *  
		 *  - 출력
		 *  첫 줄에 각 구간의 매출액 종류를 순서대로 출력
		 *  
		 *  ex)
		 *  7 4
		 *  20 12 20 10 23 17 10  ->  3 4 4 3
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int K = scan.nextInt();
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = scan.nextInt();
		}
		
		for(int result : solution(N, K, arr)) {
			System.out.print(result + " ");
		}
		
		scan.close();
		
	}
	
	public static List<Integer> solution(int N, int K, int[] arr) {
		List<Integer> answer = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		int lt = 0;
		
		for(int i = 0; i < K-1; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		
		for(int rt = K-1; rt < N; rt++) {
			map.put(arr[rt], map.getOrDefault(arr[rt], 0)+1);
			answer.add(map.size());
			map.put(arr[lt], map.get(arr[lt])-1);
			if(map.get(arr[lt]) == 0) map.remove(arr[lt]);
			lt++;
		}
		
		return answer;
	}
	
}
