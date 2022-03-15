package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class string12 {

	public static void main(String[] args) throws IOException {
		
		/*
		 * 암호
		 * 
		 * 비밀편지는 알파벳 한 문자마다 # 또는 *이 일곱 개로 구성되어 있다.
		 * 만약 "#*****#"으로 구성된 문자를 보냈다면 다음과 같이 해석함.
		 * 1. "#*****#" 일곱자리의 이진수로 바꾼다. #은 1, *은 0. 결과는 "1000001" 로 변환
		 * 2. 바뀐 2진수를 10진수화 한다. "1000001"을 10진수화 하면 65가 됨.
		 * 3. 아스키 번호가 65문자로 변환한다. 즉, 아스키번호 65는 대문자 "A" 이다.
		 * 참고로 대문자들의 아스키 번호는 'A' 65, 'B' 66, 'C'67 등 차례대로 1씩 증가해 'Z'는 90이다.
		 * 보낸 신로를 해석해주는 프로그램을 작성.
		 * 
		 * - 입력
		 * 첫 줄에는 보낸 문자의 개수가 입력된다. 다음 줄에는 문자의 개수의 일곱 배 만큼의 # 또는 * 신호가 입력.
		 * 항상 대문자로 해석할 수 있는 신호르 보낸다고 가정.
		 * 
		 * - 출력
		 * 해석한 문자열을 출력.
		 * 
		 * ex) 4 
		 * 	   #****###**#####**#####**##** -> COOL
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		System.out.println(solution(N, str));
		
		br.close();
		
	}
	
	public static String solution(int N, String str) {
		String answer = "";
		
		for(int i = 0; i < N; i++) {
			String tmp = str.substring(0, 7).replace('#', '1').replace('*', '0');
//			System.out.println(tmp);
			
			int num = Integer.parseInt(tmp, 2);
			
			answer += (char)num;
			
			str = str.substring(7);
		}
		
		return answer;
	}
	
}
