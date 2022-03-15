package array;

import java.util.Scanner;

public class array10 {

	public static void main(String[] args) {
		
		/*
		 * 봉우리
		 * 
		 * 지도 정보가 N*N 격자판에 주어진다. 각 격자에는 그 지역의 높이가 쓰여있다.
		 * 각 격자판의 숫자 중 자신의 상하좌우 숫자보다 큰 숫자는 봉우리 지역이다.
		 * 봉우리 지역이 몇 개 있는 지 알아내는 프로그램을 작성.
		 * 격자의 가장자리는 0으로 초기화 되었다고 가정.
		 * 
		 * - 입력
		 * 첫 줄에 자연수 N이 주어진다. (2 <= N <= 50)
		 * 두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 
		 * 각 자연수는 100을 넘지 않는다.
		 * 
		 * - 출력
		 * 봉우리의 개수를 출력하세요.
		 * 
		 * ex)
		 * 5
		 * 5 3 7 2 3
		 * 3 7 1 6 1
		 * 7 2 5 3 4
		 * 4 3 6 4 1
		 * 8 7 3 5 2   ->   10
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int[][] arr = new int[N][N];
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		System.out.println(solution(N, arr));
		
		scan.close();
		
	}
	
	public static int solution(int N, int[][] arr) {
		int answer = 0;
		
		int[] dx = {-1, 0, 1, 0};
		int[] dy = {0, 1, 0, -1};
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				boolean flag = true;
				for(int k = 0; k < 4; k++) {
					int nx = i+dx[k];
					int ny = j+dy[k];
					if(nx>=0 && nx<N && ny>= 0 && ny<N && arr[nx][ny] >= arr[i][j]) {
						flag=false;
						break;
					}
				}
				if(flag) answer++;
			}
		}
		
		return answer;
	}
	
}
