package string;

import java.util.Scanner;

public class string07 {

	public static void main(String[] args) {
		
		/*
		 * 회문 문자열
		 * 
		 * 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열.
		 * 문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES",
		 * 회문 문자열이 아니면 "NO"를 출력하는 프로그램 작성
		 * 단, 회문을 검사할 때 대소문자를 구분하지 않음.
		 * 
		 * - 입력
		 * 첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어짐.
		 * 
		 * - 출력
		 * 첫 번째 줄에 회문 문자열인지의 결과를 YES 또는 NO로 출력.
		 * 
		 * ex) gooG -> YES
		 */
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		
		System.out.println(solution(str));
		
		scan.close();
		
	}
	
	public static String solution(String str) {
		String answer = "";
		
		str = str.toUpperCase();
		
		String sb = new StringBuilder(str).reverse().toString();
		
		if (sb.equals(str)) {
			answer = "YES";
		} else {
			answer = "NO";
		}
		
		return answer;
	}
	
}
