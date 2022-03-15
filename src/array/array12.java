package array;

import java.util.Scanner;

public class array12 {

	public static void main(String[] args) {
		
		/*
		 * 멘토링
		 * 
		 * M번의 수학테스트 등수를 가지고 멘토와 멘티를 결정.
		 * 만약에 A 멘토, B 멘티이면 A 학생을 M번의 수학테스트에서 모두 B학생보다 등수가 앞서야 함.
		 * M번의 수학성적이 주어지면 멘토와 멘티가 되는 짝을 만들 수 있는 경우가 총 몇가지 인지 출력하는 프로그램 완성.
		 * 
		 * - 입력
		 * 첫 번째 줄에 반 학생 수 N(1<=N<=20)과 M(1<=M<=10)이 주어짐.
		 * 두 번째 줄부터 M개의 줄에 걸쳐 수학테스트 결과가 학생번호로 주어짐.
		 * 학생 번호가 제일 앞에서부터 1, 2, N등 순으로 표현됨.
		 * 만약 한 줄에 N=4이고, 테스트결과가 3 4 1 2 로 입력되었다면,
		 * 3번-1등, 4번-2등, 1번-3등, 2번-4등을 의미
		 * 
		 * - 출력
		 * 첫 번째 줄에 짝을 만들 수 있는 총 경우를 출력
		 * 
		 * ex)
		 * 4 3
		 * 3 4 1 2 
		 * 4 3 2 1
		 * 3 1 4 2  ->  3
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int M = scan.nextInt();
		int[][] arr = new int[M][N];
		
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < N; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		System.out.println(solution(N, M, arr));
		
		scan.close();
		
	}
	
	public static int solution(int N, int M, int[][] arr) {
		int answer = 0;
		
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= N; j++) {
				int cnt = 0;
				for(int k = 0; k < M; k++) {
					int pi = 0;
					int pj = 0;
					for(int s = 0; s < N; s++) {
						if(arr[k][s] == i) pi=s;
						if(arr[k][s] == j) pj=s;
					}
					if(pi < pj) cnt++;
				}
				if(cnt == M) {
					answer++;
				}
			}
		}
		
		return answer;
	}
	
}
