package sortingSearching;

import java.util.Arrays;
import java.util.Scanner;

public class sorting08 {

	public static void main(String[] args) {
		
		/*
		 * 이분검색
		 * 
		 * 임의의 N개의 숫자가 입력으로 주어진다.
		 * N개의 수를 오름차순으로 정렬한 다음 N개의 수 중 한 개의 수인 M이 주어지면
		 * 이분검색으로 M이 정렬된 상태에서 몇 번째에 있는지 구하는 프로그램 작성.
		 * 단, 중복값은 존재하지 않는다.
		 * 
		 * - 입력
		 * 첫 줄에 한 줄에 자연수 N과 M이 주어짐.
		 * 두 번째 줄에 N개의 수가 공백을 사이에 두고 주어짐.
		 * 
		 * - 출력
		 * 첫 줄에 정렬 후 M의 값의 위치 번호를 출력.
		 * 
		 * ex)
		 * 8 32
		 * 23 87 65 12 57 32 99 81	-> 	3
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int M = scan.nextInt();
		int[] arr= new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println(solution(N, M, arr));
		
		scan.close();
		
	}
	
	public static int solution(int N, int M, int[] arr) {
		int answer = 0;
		
		Arrays.sort(arr);
		
		int lt = 0;
		int rt = N-1;
		
		while(lt <= rt) {
			int mid = (lt+rt)/2;
			if(arr[mid] == M) {
				answer = mid+1;
				break;
			} 
			if(arr[mid] > M) {
				rt = mid-1;
			} else lt= mid+1;
		}
		
		return answer;
	}
	
}
