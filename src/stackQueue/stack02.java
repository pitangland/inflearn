package stackQueue;

import java.util.Scanner;
import java.util.Stack;

public class stack02 {

	public static void main(String[] args) {
		
		/*
		 * 괄호문자제거
		 * 
		 * 입력된 문자열에서 소괄호() 사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력하는 프로그램 작성.
		 * 
		 * - 입력
		 * 첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.
		 * 
		 * - 출력
		 * 남은 문자만 출력한다.
		 * 
		 * ex)
		 * (A(BC)D)EF(G(H)(IJ)K)LM(N)   ->   EFLM
		 */
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		
		System.out.println(solution(str));
		
		scan.close();
		
	}
	
	public static String solution(String str) {
		String answer = "";
		
		Stack<Character> stack = new Stack<>();
		
		for(char x : str.toCharArray()) {
			if(x == ')') {
				while(stack.pop() != '(');
			} else {
				stack.push(x);
			}
		}
		
		for(int i = 0; i < stack.size(); i++) {
			answer += stack.get(i);
		}
		
		return answer;
	}
	
}
