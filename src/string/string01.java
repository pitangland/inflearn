package string;

import java.util.Scanner;

public class string01 {

	public static void main(String[] args) {
		
		/*
		 * 문자 찾기
		 * 
		 * 한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성.
		 * 대소문자를 구분하지 않고, 문자열의 길이는 100을 넘지 않는다.
		 * 
		 * - 입력
		 * 첫 줄에 문자열이 주어지고, 두 번째 줄에 문자가 주어진다.
		 * 문자열은 영어 알파벳으로만 구성되어 있다.
		 * 
		 * - 출력
		 * 첫 줄에 해당 문자의 개수를 출력한다.
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		char c = scan.next().charAt(0);
		
		System.out.println(solution(str,c));
		
		scan.close();
		
	}
	
	public static int solution(String str, char t) {
		int answer = 0;
		
		str = str.toUpperCase();
		t = Character.toUpperCase(t);
		
//		for (int i = 0; i < str.length(); i++) {
//			if (str.charAt(i) == t) {
//				answer++;
//			}
//		}
		
		for (char x : str.toCharArray()) {
			if(x == t) {
				answer++;
			}
		}
		
		return answer;
	}
	
	
}
