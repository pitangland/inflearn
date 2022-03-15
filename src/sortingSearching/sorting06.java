package sortingSearching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class sorting06 {

	public static void main(String[] args) {
		
		/*
		 * 장난꾸러기
		 * 
		 * N명의 학생들이 있고 키가 가장 작은 학생부터 일렬로 키순으로 세웠다.
		 * 제일 앞에 가장 작은 학생부터 반 번포를 1번부터 N번까지 부여.
		 * 철수는 짝꿍보다 키가 큰데 앞 번호를 받고 싶어 짝꿍과 자리를 바꿈.
		 * 하지만, 선생님은 사실을 모르고 서 있는 순서대로 번호를 부여.
		 * 철수와 짝꿍이 자리를 바꾼 반 학생들의 일렬로 서있는 키 정보가 주어질 때 철수가 받은 번호와
		 * 철수 짝꿍이 받은 번호를 차례로 출력하는 프로그램 작성.
		 * 
		 * - 입력
		 * 첫 번째 줄에 자연수 N이 주어짐.
		 * 두 번째 줄에 제일 앞에부터 일렬로 서있는 학생들의 키가 주어짐.
		 * 키 H는 (120 <= H <= 180)의 자연수.
		 * 
		 * - 출력
		 * 첫 번째 줄에 철수의 반 번호와 짝꿍의 반 번호를 차례로 출력.
		 * 
		 * ex)
		 * 9
		 * 120 125 152 130 135 135 143 127 160	->	3 8
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = scan.nextInt();
		}
		
		for(int result : solution(N, arr)) {
			System.out.print(result + " ");
		}
		 
		scan.close();
		
	}
	
	public static List<Integer> solution(int N, int[] arr) {
		List<Integer> answer = new ArrayList<>();
		
		// clone() 복사하는 메서드
		int[] tmp = arr.clone();
		Arrays.sort(tmp);
		
		for(int i = 0; i < N; i++) {
			if(arr[i] != tmp[i]) {
				answer.add(i+1);
			}
		}
		
		return answer;
	}
	
}
