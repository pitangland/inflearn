package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class array03 {

	public static void main(String[] args) {
		
		/*
		 * 가위 바위 보
		 * 
		 * A, B 두 사람이 가위바위보 게임을 한다.
		 * 총 N번의 게임을 하여 A가 이기면 A를 출력, B가 이기면 B를 출력.
		 * 비길 경우 D를 출력. 가위 = 1, 바위 = 2, 보 = 3
		 * 두 사람의 각 회가 누가 이겼는지 출력하는 프로그램 작성
		 * 
		 * - 입력
		 * 첫 번째 줄에 게임 횟수인 자연수 N(1 <= N <= 100)
		 * 두 번째 줄에 A가 낸 가위, 바위, 보 정보가 N개.
		 * 세 번째 줄에 B가 낸 가위, 바위, 보 정보가 N개.
		 * 
		 * - 출력
		 * 각 줄에 각 회의 승자를 출력. 비겼을 경우 D를 출력.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int[] arrA = new int[N];
		int[] arrB = new int[N];
		
		for(int i = 0; i < N; i++) {
			arrA[i] = scan.nextInt();
		}
		for(int i = 0; i < N; i++) {
			arrB[i] = scan.nextInt();
		}
		
		for(String result : solution(N, arrA, arrB)) {
			System.out.println(result);
		}
		
		scan.close();
		
	}
	
	public static List<String> solution(int N, int[] A, int[] B) {
		List<String> answer = new ArrayList<String>();
		
		for(int i = 0; i < N; i++) {
			if(A[i] == B[i]) {
				answer.add("D");
			} else if (A[i] == 1 && B[i] == 3) {
				answer.add("A");
			} else if (A[i] == 2 && B[i] == 1) {
				answer.add("A");
			} else if (A[i] == 3 && B[i] == 2) {
				answer.add("A");
			} else {
				answer.add("B");
			}
		}
		
		return answer;
	}
	
}
