package dynamicProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class dp03 {

	public static void main(String[] args) {
		
		/*
		 * 최대 부분 증가수열
		 * N개의 자연수로 이루어진 수열이 주어졌을 때,
		 * 그 중에서 가장 길게 증가하는 원소들의 집합을 찾는 프로그램 작성.
		 * 예를 들어, 원소가 2,7,5,8,6,4,7,12,3 이면 가장 길게 증가하도록 원소들을 차례대로 뽑아내면 
		 * 2,5,6,7,12 를 뽑아내어 길이가 최대 5인 부분 증가수열을 만들 수 있다.
		 * 
		 * - 입력
		 * 첫째 줄에 입력되는 데이터의 수 N을 의미하고,
		 * 둘째 줄은 N개의 입력데이터들이 주어진다.
		 * 
		 * - 출력
		 * 첫 번째 줄에 부분증가수열의 최대 길이를 출력한다.
		 * 
		 * ex)
		 * 8
		 * 5 3 7 8 6 2 9 4 -> 4
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
	
	public static int solution(int N, int[] arr) {
		int answer = 0;
		int dy[] = new int[N];
		
		// 직관적인 값은 초기화시켜주고 시작하는 것이 유리.
		dy[0] = 1;
		
		for(int i = 1; i < N; i++) {
			int max = 0;
			for(int j = i-1; j >= 0; j--) {
				if(arr[j] < arr[i] && dy[j] > max) {
					max = dy[j];
				}
			}
			dy[i] = max+1;
			answer = Math.max(answer, dy[i]);
		}
		
		return answer;
	}
	
}
