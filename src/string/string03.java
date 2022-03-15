package string;

import java.util.Scanner;
import java.util.StringTokenizer;

public class string03 {
	
	public static void main(String[] args) {
		
		/*
		 * 문장 속 단어
		 * 
		 * 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램 작성.
		 * 문장속의 각 단어는 공백으로 구분.
		 * 
		 * - 입력
		 * 첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어짐. 
		 * 문장은 영어 알파벳으로만 구성.
		 * 
		 * - 출력
		 * 첫 줄에 가장 긴 단어를 출력.
		 * 가장 길이가 긴 단어가 여러개일 경우 문장 맨 앞쪽에 위치한 단어가 답.
		 * 
		 * ex) it is time to study = study 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		
		System.out.println(solution(str));
		
		scan.close();
		
	}
	
	public static String solution (String str) {
		
		String answer = ""; // 답을 저장.
		
		// 가장 작은 수로 초기화.
		int max = Integer.MIN_VALUE;
		
		String[] s = str.split(" ");
		
		for (String x : s) {
			int len = x.length();
			if (len > max) {
				max = len;
				answer = x;
			}
		}
		
		return answer;
	}
	
}
