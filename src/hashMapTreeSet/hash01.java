package hashMapTreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class hash01 {

	public static void main(String[] args) {
		
		/*
		 * 학급 회장
		 *
		 * 학급 회장을 뽑는데 후보로 기호 A, B, C, D, E 후보가 등록을 했다.
		 * 투표용지에는 반 학생들이 자기가 선택한 후보의 기호가 쓰여져 있으며 선생님은 그 기호를 발표하고 있다.
		 * 선생님의 발표가 끝난 후 어떤 기호의 후보가 학급 회장이 되었는지 출력하는 프로그램 작성.
		 * 반드시 한 명의 학급회장이 선출되도록 투표결과가 나왔다고 가정.
		 * 
		 * - 입력
		 * 첫 줄에는 반 학생수 N이 주어짐.
		 * 두 번째 줄에 N개의 투표용지에 쓰여져 있던 각 후보의 기호가 선생님이 발표한 순서대로 문자열로 입력
		 * 
		 * - 출력
		 * 학급 회장으로 선택된 기호를 출력
		 * 
		 * ex)
		 * 15
		 * BACBACCACCBDEDE  ->  C
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		String str = scan.next();
		
		System.out.println(solution(N, str));
		
		scan.close();
		
	}
	
	public static char solution(int N, String str) {
		char answer = ' ';
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char x : str.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0)+1);
		}
		int max = Integer.MIN_VALUE;
		for(char key : map.keySet()) {
			if(map.get(key) > max) {
				max = map.get(key);
				answer = key;
			}
		}
		
		return answer;
	}
	
}
