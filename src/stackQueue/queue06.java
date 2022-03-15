package stackQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class queue06 {

	public static void main(String[] args) {
		
		/*
		 * 공주 구하기
		 * 
		 * 왕자가 N명이 있는데 공주를 구하러 가야함.
		 * 왕은 왕자들을 나이 순으로 1번부터 N번까지 차례로 번호를 매긴다.
		 * 그리고 1번부터 N번까지 순서대로 시계방향으로 돌아가며 동그랗게 앉게 한다.
		 * 1번부터 번호를 외치고, 한 왕자가 K를 외치면 그 왕자는 공주를 구하러 가는데 제외.
		 * 원밖으로 나오게 되고 그 다음부터 다시 1부터 시작해 번호를 외침.
		 * 마지막까지 남은 왕자가 공주를 구하러 갈 수있음.
		 * N과 K가 주어질 때 공주를 구하러 갈 왕자의 번호를 출력하는 프로그램 작성.
		 * 
		 * - 입력
		 * 첫 줄에 자연수 N과 K가 주어짐.
		 * 
		 * - 출력
		 * 첫 줄에 마지막 남은 왕자의 번호를 출력
		 * 
		 * ex)
		 * 8 3   ->   7
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int K = scan.nextInt();
		
		System.out.println(solution(N, K));
		
		scan.close();
		
	}
	
	public static int solution (int N, int K) {
		int answer = 0;
		
		Queue<Integer> Q = new LinkedList<>();
		
		for(int i = 1; i <= N; i++) {
			Q.offer(i);
		}
		
		while(!Q.isEmpty()) {
			for(int i = 1; i < K; i++) {
				Q.offer(Q.poll());
			}
			Q.poll();	// K번째의 번호를 외친 왕자가 빠짐.
			
			if(Q.size() == 1) answer = Q.poll();
		}
		
		return answer;
	}
	
}
