package stackQueue;

import java.util.Scanner;
import java.util.Stack;

public class stack05 {

	public static void main(String[] args) {
		
		/*
		 * 쇠막대기
		 * 
		 * 쇠막대기와 레이저의 배치는 다음 조건을 만족.
		 * 쇠막대기는 자신보다 긴 쇠막대기 위에만 놓을 수 있고, 완전히 포함되도록 놓되, 끝점은 겹치지 않는다.
		 * 각 쇠막대기를 자르는 레이저는 적어도 하나 존재.
		 * 레이저는 어떤 쇠막대기의 양 끝점과도 겹치지 않는다.
		 * 레이저는 () 으로 표현, ()은 반드시 레이저를 표현
		 * 쇠막대기의 왼쪽 끝은 (, 오른쪽 끝은 ) 로 표현.
		 * 
		 * - 입력
		 * 한 줄에 쇠막대기와 레이저의 배치를 나타내는 괄호 표현이 공백없이 주어진다. 괄호 문자의 개수는 최대 100,000
		 * 
		 * - 출력
		 * 잘려진 조각의 총 개수를 나타내는 정수를 한 줄에 출력.
		 * 
		 * ex)
		 * ()(((()())(())()))(())   ->   17
		 */
	
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		
		System.out.println(solution(str));
		
		scan.close();
		
	}
	
	public static int solution (String str) {
		int answer = 0;
		Stack<Character> stack = new Stack<>();
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '(') stack.push('(');
			else {
				stack.pop();
				// 레이저다
				if(str.charAt(i-1) == '(') answer += stack.size();
				else answer++;
			}
		}
		
		return answer;
	}
	
}
