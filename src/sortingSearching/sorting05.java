package sortingSearching;

import java.util.Arrays;
import java.util.Scanner;

public class sorting05 {

	public static void main(String[] args) {
		
		/*
		 * 중복 확인
		 * 
		 * 반에는 N명의 학생들이 있고,
		 * 선생님은 반 학생들에게 1부터 10,000,000까지의 자연수 중 각자가 좋아하는 숫자 하나 적어내라고 함.
		 * 만약 N명의 학생들이 적어낸 숫자 중 중복된 숫자가 존재하면 D를 출력.
		 * N명이 모두 각자 다른 숫자를 적어냈다면 U를 출력하는 프로그램 작성.
		 * 
		 * - 입력
		 * 첫 번째 줄에 자연수 N이 주어짐.
		 * 두 번째 줄에 학생들이 적어 낸 N개의 자연수가 입력.
		 * 
		 * - 출력
		 * 첫 번째 줄에 D 또는 U를 출력.
		 * 
		 * ex)
		 * 8
		 * 20 25 52 30 39 33 43 33		->  	D
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

		Arrays.sort(arr);
		
		for(int i = 0; i < N-1; i++) {
			if(arr[i] == arr[i+1]) return "D";
		}
		return "U";
		
	}
	
}
