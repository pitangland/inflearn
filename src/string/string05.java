package string;

import java.util.Scanner;

public class string05 {

	public static void main(String[] args) {
		
		/*
		 * 특정 문자 뒤집기 
		 * 
		 * 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
		 * 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램 작성.
		 * 
		 * - 입력
		 * 첫 줄에 길이가 100을 넘지 않는 문자열이 주어짐.
		 * 
		 * - 출력
		 * 첫 줄에 알파벳만 뒤집힌 문자열을 출력
		 * 
		 * ex) a#b!GE*T@S -> S#T!EG*b@a
		 */
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		
		System.out.println(solution(str));
		
		scan.close();
		
	}
	
	public static String solution (String str) {
		String answer = "";
		
		// str의 기반한 문자배열이 만들어짐.
		char[] s = str.toCharArray(); 
		
		int lt = 0;
		int rt = str.length() - 1;
		
		while (lt < rt) {
			// 특수문자이면 ? 참. 아니면? 거짓.
			if (!Character.isAlphabetic(s[lt])) {
				lt++;
			} else if (!Character.isAlphabetic(s[rt])){
				rt--;
			} else {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;				
			}
		}
		// String 으로 전환해줘야 하므로 valueOf로 String화 해줌.
		answer = String.valueOf(s);
		return answer;
	}
	
}
