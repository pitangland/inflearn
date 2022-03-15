package array;

import java.util.Scanner;

public class array11 {

	public static void main(String[] args) {
		
		/*
		 * 임시반장 정하기
		 * 
		 * 자기반 학생 중 1학년부터 5학년까지 지내오면서 한번이라도 같은 반이었던 사람이 가장 많은 학생을 임시반장을 선정하려함.
		 * 그래서 선생님은 각 학생들이 1학년부터 5학년까지 몇 반에 속했었는지 나타내는 표를 만듦.
		 * 
		 * - 입력 
		 * 첫째 줄에는 반의 학생 수를 나타내는 정수가 주어짐. 학생 수는 3 이상 1000 이하이다.
		 * 둘째 줄부터는 1번 학생부터 차례대로 각 줄마다 1학년부터 5학년까지 몇 반에 속했었는지를 나타내는 5개의 정수가 빈칸 하나를 사이에 두고 주어짐.
		 * 주어지는 정수는 모두 1이상 9 이하의 정수.
		 * 
		 * - 출력
		 * 첫 줄에 임시반장으로 정해진 학생의 번호를 출력
		 * 단, 임시 반장이 될 수 있는 학생이 여러 명인 경우, 그 중 가장 작은 번호만 출력
		 * 
		 * ex)
		 * 5
		 * 2 3 1 7 3
		 * 4 1 9 6 8
		 * 5 5 2 4 4 
		 * 6 5 2 6 7
		 * 8 4 2 2 2  ->  4
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int[][] arr = new int[N+1][6];
		
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= 5; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		System.out.println(solution(N, arr));
		
		scan.close();
		
	}
	
	public static int solution(int N, int[][] arr) {
		int answer = 0;
		int max = Integer.MIN_VALUE;
			
		for(int i = 1; i <= N; i++) {
			int cnt = 0;
			for(int j = 1; j <= N; j++) {
				for(int k = 1; k <= 5; k++) {
					if(arr[i][k] == arr[j][k]) {
						cnt++;
						break;
					}
				}
			}
			if(cnt > max) {
				max = cnt;
				answer = i;
			}
		}
		
		return answer;
	}
	
}
