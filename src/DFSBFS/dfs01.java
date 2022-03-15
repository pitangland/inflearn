package DFSBFS;

import java.util.Scanner;

public class dfs01 {

	public static void main(String[] args) {
		
		/*
		 * 합이 같은 부분집합(DFS)
		 * 
		 * N개의 원소로 구성된 자연수 집합이 주어지면,
		 * 이 집합을 두 개의 부분집합으로 나누었을 때
		 * 두 부분집합의 원소의 합이 서로 같은 경우가 존재하면 "YES"를 출력, 그렇지 않으면 "NO"를 출력하는 프로그램 작성.
		 * 둘로 나뉘는 두 부분집합은 서로소 집합, 두 부분집합을 합하면 입력으로 주어진 원래의 집합이 되어야 한다.
		 * 
		 * - 입력
		 * 첫 번째 줄에 자연수 N이 주어진다.
		 * 두 번째 줄에 집합의 원소 N개가 주어진다. 각 원소는 중복되지 않는다.
		 * 
		 * - 출력
		 * 첫 번째 줄에 "YES" 또는 "NO"를 출력
		 * 
		 * ex)
		 * 6
		 * 1 3 5 6 7 10 	->	YES
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println(solution(N, arr));
		
		scan.close();
		
	}
	
	public static String solution(int N, int[] arr) {
		
		
		return "YES";
	}
	
}
