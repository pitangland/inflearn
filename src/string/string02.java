package string;

import java.util.Scanner;

public class string02 {

	public static void main(String[] args) {
		
		/*
		 * 대소문자 변환
		 * 
		 * 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램 작성
		 * 
		 * - 입력
		 * 첫 줄에 문자열이 입력되고 문자열의 길이는 100을 넘지 않는다.
		 * 문자열은 영어 알파벳으로만 구성되어 있다.
		 * 
		 * - 출력
		 * 첫 줄에 대문자는 소문자로, 소문자는 대문자로 변환된 문자열을 출력한다.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		
		System.out.println(solution(str));
		
		scan.close();
		
	}
	
	public static String solution(String str) {
		String answer = "";
		
//		for (char x : str.toCharArray()) {
//			if (Character.isLowerCase(x)) {
//				answer += Character.toUpperCase(x);
//			} else {
//				answer += Character.toLowerCase(x);
//			}
//		}
		
		for (char x : str.toCharArray()) {
			// 소문자냐?
			if (x >= 97 && x <= 122) {
				answer += (char)(x-32);
			} else {
				answer += (char)(x+32);
			}
		}
		
		return answer;
	}
	
}
