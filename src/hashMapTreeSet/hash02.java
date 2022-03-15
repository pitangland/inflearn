package hashMapTreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class hash02 {

	public static void main(String[] args) {
		
		/*
		 * 아나그램
		 * 
		 * Anagram이란 두 문자열이 알파벳의 나열 순서를 다르지만 그 구성이 일치하면 두 단어는 아나그램이라 한다.
		 * AbaAeCe와 baeeACA는 알파벳을 나열 순서는 다르지만 그 구성을 살펴보면
		 * 알파벳과 그 개수가 모두 일치한다. 즉, 어느 한 단어를 재 배열하면 상대편 단어가 될 수 있는 것을 아나그램.
		 * 길이가 같은 두 개의 단어가 주어지면 두 단어가 아나그램인지 판별하는 프로그램을 작성. 
		 * 아나그램 판별 시 대소문자는 구분된다.
		 * 
		 * - 입력
		 * 첫 줄에 첫 번째 단어가 입력되고, 두 번째 줄에 두 번째 단어가 입력된다.
		 * 단어의 길이는 100을 넘지 않는다.
		 * 
		 * - 출력
		 * 두 단어가 아나그램이면 "YES"를 출력, 아니면 "NO"를 출력
		 * 
		 * ex)
		 * AbaAeCe
		 * baeeACA  -> YES
		 */
		
		Scanner scan = new Scanner(System.in);
		
		String a = scan.nextLine();
		String b = scan.nextLine();
		
		System.out.println(solution(a, b));
		
		scan.close();
		
	}
	
	public static String solution(String a, String b) {

		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char key : a.toCharArray()) {
			map.put(key, map.getOrDefault(key, 0)+1);
		}
		
		for(char key : b.toCharArray()) {
			if(!map.containsKey(key) || map.get(key) == 0) {
				return "NO";
			}
			map.put(key, map.get(key)-1);
		}
		
		return "YES";
	}
	
}
