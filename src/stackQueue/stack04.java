package stackQueue;

import java.util.Scanner;
import java.util.Stack;

public class stack04 {

	public static void main(String[] args) {
		
		/*
		 * 후위식 연산(postfix)
		 * 
		 * 후위연산식이 주어지면 연산한 결과를 출력하는 프로그램 작성.
		 * 만약 3*(5+2)-9 를 후위연산식으로 표현하면 352+*9- 로 표현되며 그 결과는 12
		 * 
		 * - 입력
		 * 첫 줄에 후위연산식이 주어짐. 연산식의 길이는 50을 넘지 않는다.
		 * 식은 1~9의 숫자와 +, -, *. / 연산자로만 이루어진다.
		 * 
		 * - 출력
		 * 연산한 결과를 출력.
		 * 
		 * ex)
		 * 352+*9-    ->    12
		 */
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		
		System.out.println(solution(str));
		
		scan.close();
		
	}
	
	public static int solution(String str) {
		int answer = 0;
		
		Stack<Integer> stack = new Stack<>();
		
		int lt = 0;
		int rt = 0;
		
		for(char x : str.toCharArray()) {
			if(Character.isDigit(x)) stack.push(x - 48);
			else {
				rt = stack.pop();
				lt = stack.pop();
				if(x == '+') stack.push(lt+rt);
				else if(x == '-') stack.push(lt-rt);
				else if(x == '*') stack.push(lt*rt);
				else if(x == '/') stack.push(lt/rt);
			}
		}
		
		answer = stack.get(0);
		
		return answer;
	}
	
}
