package string;

import java.util.Scanner;

public class string08 {

	public static void main(String[] args) {
		
		/*
		 * 유효한 팰린드롬
		 * 
		 * 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라 함.
		 * 문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 "NO"를 출력하는 프로그램 작성.
		 * 단, 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않음.
		 * 알파벳 이외의 문자들을 무시.
		 * 
		 * - 입력
		 * 첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어짐.
		 * 
		 * - 출력
		 * 첫 번째 줄에 팰린드롬인지의 결과를 YES 또는 NO로 출력
		 * 
		 * ex) found7, time: study; Yduts; emit, 7Dnuof -> YES
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		
		System.out.println(solution(str));
		
		scan.close();
		
	}
	
	public static String solution(String str) {
		String answer = "NO";
		
		str = str.toUpperCase().replaceAll("[^A-Z]", "");
//		System.out.println(str);
		
		String sb = new StringBuilder(str).reverse().toString();
		
		if (sb.equals(str)) {
			answer = "YES";
		}
		
		return answer;
	}
	
}
