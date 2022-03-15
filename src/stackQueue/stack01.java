package stackQueue;

import java.util.Scanner;
import java.util.Stack;

public class stack01 {

	public static void main(String[] args) {
		
		/*
		 * 올바른 괄호
		 * 
		 * 괄호가 입력되면 올바른 괄호이면 "YES" 올바르지 않으면 "NO"를 출력
		 * (())() -> 올바르게 위치, (()())) -> 올바른 위치 아님.
		 * 
		 * - 입력
		 * 첫 번째 줄에 괄호 문자열이 입력. 문자열의 최대 길이는 30
		 * 
		 * - 출력
		 * 첫 번째 줄에 YES, NO를 출력.
		 * 
		 * ex)
		 * (()(()))(()  ->  NO
		 */
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		
		System.out.println(solution(str));
		
		scan.close();
		
	}
	
	public static String solution(String str) {
		String answer = "YES";
		
		Stack<Character> stack = new Stack<>();
		
		for(char x : str.toCharArray()) {
			if(x == '(') stack.push(x);
			else {
				if(stack.isEmpty()) return "NO";
				stack.pop();
			}
		}
		
		if(!stack.isEmpty()) return "NO";
		
		return answer;
	}
	
}
