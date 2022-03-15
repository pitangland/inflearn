package sortingSearching;

import java.util.Scanner;

public class sorting02 {

	public static void main(String[] args) {

		/*
		 * 버블 정렬
		 * 
		 * N개의 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램 작성. 정렬하는 방법은 버블정렬입니다.
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
		 * 13 5 11 7 23 15 -> 5 7 11 13 15 23
		 */

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = scan.nextInt();
		}

		for (int result : solution(N, arr)) {
			System.out.print(result + " ");
		}

		scan.close();

	}

	public static int[] solution(int N, int[] arr) {

		for(int i = arr.length -1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if(arr[j] > arr[i]) {
					int tmp = arr[j];
					arr[j] = arr[i];
					arr[i] = tmp;
				}
			}
		}

		return arr;

	}

}
