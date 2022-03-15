package sortingSearching;

import java.util.Scanner;

public class sorting03 {

	public static void main(String[] args) {
		
		/*
		 * 삽입 정렬
		 * 
		 * N개의 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램 작성.
		 * 정렬하는 방법은 삽입정렬.
		 * 
		 * - 입력 
		 * 첫 번째 줄에 자연수 N이 주어진다. 두 번째 줄에 N개의 자연수가 공백을 사이에 두고 입력. 각 자연수는 정수형 범위 안에
		 * 있다.
		 * 
		 * - 출력 
		 * 오름차순으로 정렬된 수열을 출력.
		 * 
		 * ex) 
		 * 6 
		 * 11 7 5 6 10 9 ->  5 6 7 9 10 11
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = scan.nextInt();
		}
		
		for(int result : solution(N, arr))
		System.out.print(result + " ");
		
		scan.close();
		
	}
	
	public static int[] solution(int N, int[] arr) {
		for(int i = 0; i < N; i++) {
			int tmp = arr[i];
			int j;
			for(j = i-1; j >= 0; j--) {
				if(arr[j] > tmp) {
					arr[j+1] = arr[j];
				} else {
					break;
				}
			}
			arr[j+1] = tmp;
		}
		
		return arr;
	}
	
}
