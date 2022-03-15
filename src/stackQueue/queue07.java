package stackQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class queue07 {

	public static void main(String[] args) {
		
		/*
		 * 교육과정 설계
		 * 
		 * 수업 중 필수과목이 있고, 반드시 이수해야 하며, 그 순서도 정해져 있다.
		 * 수업설계가 잘 되었다면 "YES", 잘못되었다면 "NO" 를 출력하는 프로그램 작성.
		 * 
		 * - 입력
		 * 첫 줄에 한 줄에 필수과목의 순서가 주어진다. 모든 과목은 영문 대문자이다.
		 * 두 번째 줄부터 현수가 짠 수업설계가 주어진다. (수업설계의 길이는 30 이하)
		 * 
		 * - 출력
		 * 첫 줄에 수업설계가 잘 된 것이면 "YES", 잘못된 것이면 "NO"를 출력.
		 * 
		 * ex)
		 * CBA
		 * CBDAGE	 -> 	YES
		 */
		
		Scanner scan = new Scanner(System.in);
		
		String ans = scan.nextLine();
		String str = scan.nextLine();
		
		System.out.println(solution(ans, str));
		
		scan.close();
		
	}
	
	public static String solution(String ans, String str) {
		String answer = "YES";
		
		Queue<Character> Q = new LinkedList<>();
		
		for(char x : ans.toCharArray()) {
			Q.offer(x);
		}
		
		for(char x : str.toCharArray()) {
			if(Q.contains(x)) {
				if(x != Q.poll()) return "NO";
			}
		}
		
		if(!Q.isEmpty()) return "NO";
		
		return answer;
	}
	
}
