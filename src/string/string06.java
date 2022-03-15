package string;

import java.util.Scanner;

public class string06 {

	public static void main(String[] args) {
		
		/*
		 * 중복문자제거
		 * 
		 * 소문자로 된 한 개의 문자열이 입력되면 중복된 문자를 제거, 출력하는 프로그램 작성
		 * 중복이 제거된 문자열의 각 문자의 원래 문자열의 순서를 유지
		 * 
		 * - 입력
		 * 첫 줄에 문자열이 입력. 문자열의 길이는 100을 넘지 않는다.
		 * 
		 * - 출력
		 * 첫 줄에 중복문자가 제거된 문자열을 출력.
		 * 
		 * ex) ksekkset -> kset
		 */
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		
		System.out.println(solution(str));
		
		scan.close();
		
	}
	
	public static String solution(String str) {
		String answer = "";
		
		// indexOf는 제일 처음 발견된 번호가 나오게 됨.
		
		for (int i = 0; i < str.length(); i++) {
//			System.out.println(str.charAt(i) + "+i+" + str.indexOf(str.charAt(i)));
			
			// indexOf의 번호와 i의 번호가 같으면 아직 중복이 안된 것을 알 수 있음.
			if (str.indexOf(str.charAt(i)) == i) {
				answer += str.charAt(i);
			}
		}
		
		return answer;
	}
	
}
