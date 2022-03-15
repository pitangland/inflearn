package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class string04 {

	public static void main(String[] args) throws IOException {
		
		/*
		 * 단어 뒤집기
		 * 
		 * N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램 작성.
		 * 
		 * - 입력
		 * 첫 줄에 자연수 N(3 <= N <= 20)이 주어짐.
		 * 두 번째 줄 부터 N개의 단어가 각 줄에 하나씩 주어짐.
		 * 단어는 영어 알파벳으로만 구성.
		 * 
		 * - 출력
		 * N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어 출력
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		String[] str = new String[N];
		
		for (int i = 0; i < N; i++) {
			str[i] = br.readLine();
		}
		
		for(String result : solution(N, str)) {
			System.out.println(result);
		}
		
		br.close();
	}
	
	public static List<String> solution(int n, String[] str) {
		List<String> answer = new ArrayList<String>();
		
		for(String result : str) {
			String sb = new StringBuilder(result).reverse().toString();
			answer.add(sb);
		}
		
		return answer;
	}
	
}
