package dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class dp06 {

	public static void main(String[] args) throws IOException {
		
		/*
		 * 최대점수 구하기(냅색 알고리즘)
		 * 이번 정보올림피아드대회에서 좋은 성적을 내기 위하여 현수는 선생님이 주신 N개의 문제를 풀려고한다.
		 * 각 문제는 그것을 풀었을 때 얻는 점수와 푸는데 걸리는 시간이 주어지게 된다.
		 * 제한시간 M 안에 N개의 문제 중 최대점수를 얻을 수 있도록 해야 한다.
		 * (해당문제는 해당시간이 걸리면 푸는 걸로 간주한다. 한 유형당 한개만 풀 수 있다.)
		 * 
		 * - 입력
		 * 첫 번째 줄에 문제의 개수 N과 제한시간 M이 주어진다.
		 * 두 번째 줄부터 N줄에 걸쳐 문제를 풀었을 때의 점수와 푸는데 걸리는 시간이 주어진다.
		 * 
		 * - 출력
		 * 첫 번째 줄에 제한 시간안에 얻을 수 있는 최대점수를 출력한다.
		 * 
		 * ex)
		 * 5 20
		 * 10 5
		 * 25 12
		 * 15 8
		 * 6 3
		 * 7 4		->		41
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st; 
		st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] dy = new int[M+1];
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int ps = Integer.parseInt(st.nextToken());
			int pt = Integer.parseInt(st.nextToken());
			
			for(int j = M; j >= pt; j--) {
				dy[j] = Math.max(dy[j], dy[j-pt]+ps);
			}
		}
		
		System.out.println(dy[M]);
		
		br.close();
		
	}
	
	
}
