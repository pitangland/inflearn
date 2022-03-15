package string;

import java.util.Scanner;

public class string11 {

	public static void main(String[] args) {
		
		/*
		 * 문자열 압축
		 * 
		 * 알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우
		 * 반복되는 문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성.
		 * 단, 반복횟수가 1인 경우 생략
		 * 
		 * - 입력
		 * 첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.
		 * 
		 * - 출력
		 * 첫 줄에 압축된 문자열을 출력한다.
		 * 
		 * ex) KKHSSSSSSSE -> K2HS7E
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		System.out.println(solution(str));
		
		scan.close();
		
	}
	
	public static String solution(String str) {
		String answer = "";
		
		// 마지막의 i와 i+1을 비교하기 위해
		str = str + " ";
		int cnt = 1;
		
		for(int i = 0; i < str.length() - 1; i++) {
			
			if(str.charAt(i) == str.charAt(i+1)) {
				cnt++;
			} else {
				answer += str.charAt(i);
				if(cnt > 1) answer += String.valueOf(cnt);
				
				cnt = 1;

			}
			
		}
		
		
		return answer;
	}
	
}
