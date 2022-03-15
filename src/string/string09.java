package string;

import java.util.Scanner;

public class string09 {

	public static void main(String[] args) {
		
		/*
		 * 숫자만 추출
		 * 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듦.
		 * 만약 "tge0a1h205er"에서 숫자만 추출 -> 0,1,2,0,5 
		 * -> 자연수로 만들면 1205가 됨.
		 * 추출하면 만들어지는 자연수를 100,000,000을 넘지 않음.
		 * 
		 * - 입력
		 * 첫 줄에 숫자가 썩인 문자열인 주어짐. 
		 * 문자열의 길이는 100을 넘지않음.
		 * 
		 * - 출력
		 * 첫 줄에 자연수를 출력.
		 * 
		 * ex) g0en2T0s8eSoft -> 208
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		
		System.out.println(solution(str));
		
		scan.close();
		
	}
	
	public static int solution(String str) {
		String answer = "";
		char[] c = str.toCharArray();
		
		for(int i = 0; i < str.length(); i++) {
			// 숫자냐? isDigit
			if (Character.isDigit(c[i])) {
//				System.out.println(c[i]);
				answer += c[i];
			}
		}
			
		return Integer.parseInt(answer);
	}
	
}
