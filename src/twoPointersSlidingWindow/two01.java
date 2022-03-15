package twoPointersSlidingWindow;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class two01 {

	public static void main(String[] args) {
		
		/*
		 * 두 배열 합치기
		 * 
		 * 오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램 작성.
		 * 
		 * - 입력
		 * 첫 번째 줄에 첫번째 배열의 크기 N (1<=N<=100)
		 * 두 번째 줄에 N개의 배열 원소가 오름차순으로 주어짐.
		 * 세 번째 줄에 두번째 배열의 크기 M (1<=M<=100)
		 * 네 번째 줄에 M개의 배열 원소가 오름차순으로 주어짐.
		 * 각 리스트의 원소는 int형 변수의 크기를 넘지 않음.
		 * 
		 * - 출력
		 * 오름차순으로 정렬된 배열을 출력
		 * 
		 * ex)
		 * 3
		 * 1 3 5 
		 * 5
		 * 2 3 6 7 9  ->  1 2 3 3 5 6 7 9
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = scan.nextInt();
		}
		
		int M = scan.nextInt();
		int[] arr2 = new int[M];
		
		for(int i = 0; i < M; i++) {
			arr2[i] = scan.nextInt();
		}
		
		for(int result : solution(N, M, arr, arr2)) {
			System.out.print(result + " ");
		}
		
		scan.close();
		
	}
	
	public static List<Integer> solution(int N, int M, int[] arr, int[] arr2) {
		List<Integer> answer = new ArrayList<>();
		
		int p1 = 0;
		int p2 = 0;
		
		while(p1 < N && p2 < M) {
			if (arr[p1] < arr2[p2]) {
				answer.add(arr[p1++]);
			} else {
				answer.add(arr2[p2++]);
			}
		}
		
		while(p1 < N) {
			answer.add(arr[p1++]);
		}
		
		while(p2 < M) {
			answer.add(arr2[p2++]);
		}
		
		return answer;
	}
	
}



