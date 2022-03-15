package twoPointersSlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class two02 {

	public static void main(String[] args) {
		
		/*
		 * 공통원소 구하기
		 * 
		 * A, B 두 개의 집합이 주어지면 두 집합의 공통 원소를 추출. 오름차순으로 출력하는 프로그램 작성.
		 * 
		 * - 입력
		 * 첫 번째 줄에 집합 A의 크기 N(1<= N <= 30,000)
		 * 두 번째 줄에 N개의 원소. 원소가 중복되어 주어지지 않음.
		 * 세 번째 줄에 집합 B의 크기 M(1<= N <= 30,000)
		 * 네 번째 줄에 M개의 원소. 원소가 중복되어 주어지지 않음.
		 * 각 집합의 원소는 1,000,000,000 이하의 자연수
		 * 
		 * - 출력
		 * 두 집합의 공통원소를 오름차순 정렬하여 출력.
		 * 
		 * ex)
		 * 5
		 * 1 3 9 5 2
		 * 5
		 * 3 2 5 7 8  ->  2 3 5
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int[] a = new int[N];
		
		for(int i = 0; i < N; i++) {
			a[i] = scan.nextInt();
		}
		
		int M = scan.nextInt();
		int[] b = new int[M];
		
		for(int i = 0; i < M; i++) {
			b[i] = scan.nextInt();
		}
		
		for(int result : solution(N, M, a, b)) {
			System.out.print(result + " ");
		}
		
		scan.close();
		
	}
	
	public static List<Integer> solution (int N, int M, int[] a, int[] b) {
		List<Integer> answer = new ArrayList<>();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		int p1 = 0;
		int p2 = 0;
		
		while (p1 < N && p2 < M) {
			if(a[p1] == b[p2]) {
				answer.add(a[p1]);
				p1++;
				p2++;
			} else if (a[p1] < b[p2]) {
				p1++;
			} else {
				p2++;
			}
		}
		
		return answer;
	}
	
}
