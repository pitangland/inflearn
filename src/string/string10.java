package string;

import java.util.Scanner;

public class string10 {

	public static void main(String[] args) {
		
		/*
		 * 가장 짧은 문자거리
		 * 한 개의 문자열 s와 문자 t가 주어지면 
		 * 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램 작성.
		 * 
		 * - 입력
		 * 첫 번째 줄에 문자열 s와 문자 t가 주어짐.
		 * 문자열과 문자는 소문자로만 주어짐.
		 * 문자열의 길이는 100을 넘지 않음.
		 * 
		 * - 출력
		 * 첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력
		 * 
		 * ex) teachermode e -> 1 0 1 2 1 0 1 2 2 1 0
		 */
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		char c = scan.next().charAt(0);
		
		for(int result : solution(str,c)) {
			System.out.print(result + " ");
		}
		
		scan.close();
		
	}
	
	public static int[] solution(String str, char c) {
		int[] answer = new int[str.length()];
		
		int p = 1000;
		
		// 왼쪽으로부터 떨어진 거리
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == c) {
				p = 0;
				answer[i] = p;
			} else {
				p++;
				answer[i] = p;
			}
		}
		
		p = 1000; // p 초기화
		// 오른쪽으로부터 떨어진 거리
		for (int i = str.length()-1; i >= 0; i--) {
			if(str.charAt(i) == c) {
				p = 0;
				answer[i] = p;
			} else {
				p++;
				// 할당된 값 중 작은 값으로 
				answer[i] = Math.min(answer[i], p);
			}
		}
		
		return answer;
		
	}
	
}
