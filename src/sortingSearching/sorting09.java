package sortingSearching;

import java.util.Arrays;
import java.util.Scanner;

public class sorting09 {

	public static void main(String[] args) {
		
		/*
		 * 뮤직비디오 (결정알고리즘)
		 * 
		 * DVD에는 총 N개의 곡이 들어가는데, DVD에 녹활할 때에는 라이브에서의 순서가 그대로 유지되어야 함.
		 * 지니레코드는 M개의 DVD에 모든 동영상을 녹화하기로 하였다. 이때 DVD의 크기를 최소로 하려고 한다.
		 * 그리고 M개의 DVD는 모두 같은 크기여야 제조원가가 적게 들기 때문에 꼭 같은 크기로 해야 한다.
		 * 
		 * - 입력
		 * 첫째 줄에 자연수 N, M이 주어진다.
		 * 다음 줄에는 라이브에서 부른 순서대로 부른 곡의 길이가 분 단위로 주어진다.
		 * 부른 곡의 길이는 10,000분을 넘지 않는다고 가정하자.
		 * 
		 * - 출력
		 * 첫 번째 줄부터 DVD의 최소 용량 크기를 출력.
		 * 
		 * ex)
		 * 9 3
		 * 1 2 3 4 5 6 7 8 9	-> 		17
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int M = scan.nextInt();
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println(solution(N, M, arr));
		
		scan.close();
		
	}
	
	public static int solution(int N, int M, int[] arr) {
		int answer = 0;
		
		int lt = Arrays.stream(arr).max().getAsInt();
		int rt = Arrays.stream(arr).sum();
		
		while(lt <= rt) {
			int mid = (lt+rt) / 2;
			if(count(arr, mid) <= M) {
				answer = mid;
				rt = mid-1;
			} else {
				lt = mid+1;
			}
		}
		
		return answer;
	}
	
	public static int count(int[] arr, int capacity) {
		//DVD 장수
		int cnt = 1;
		//DVD 곡수
		int sum = 0;
		
		for(int x : arr) {
			if(sum + x > capacity) {
				cnt++;
				sum = x;
			} else {
				sum += x;
			}
		}
		return cnt;
	}
	
}
