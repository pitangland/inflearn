package stackQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class queue08 {

	public static void main(String[] args) {
		
		/*
		 * 응급실
		 * 
		 * 병원에는 의사가 한 명밖에 없고, 환자가 도착한 순서대로 진료를 한다.
		 * 하지만, 위험도가 높은 환자는 빨리 응급조치를 의사가 해야 한다.
		 * 환자의 진료순서는 다음과 같다.
		 * - 환자가 접수한 순서대로의 목록에서 제일 앞에 있는 환자목록을 꺼낸다.
		 * - 나머지 대기 목록에서 꺼낸 환자보다 위험도가 높은 환자가 존재하면 대기목록 제일 뒤로 다시 넣는다. 
		 * - 그렇지 않으면 진료를 받는다.
		 * 즉, 대기목록에 자기 보다 위험도가 높은 환자가 없을 때 자신이 진료를 받는 구조.
		 * N명의 대기목록 순서의 환자 위험도가 주어지면, 대기목록상의 M번째 환자는 몇번째로 진료를 받는지 출력하는 프로그램 작성.
		 * 대기 목록상의 M번째는 대기목록의 제일 처음 환자를 0번째로 간주하여 표현한 것.
		 * 
		 * - 입력
		 * 첫 줄에 자연수 N과 M이 주어짐.
		 * 두 번째 줄에 접수한 순서대로 환자의 위험도가 주어짐.
		 * 위험도는 값이 높을 수록 더 위험하다는 뜻. 같은 값의 위험도가 존재할 수 있음.
		 * 
		 * - 출력
		 * M번째 환자의 몇 번째로 진료받는지 출력
		 * 
		 * ex)
		 * 5 2
		 * 60 50 70 80 90	->	 3
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int M = scan.nextInt();
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println(solution(N, M, arr));
		scan.close();
		
	}
	
	public static int solution(int N, int M, int[] arr) {
		int answer = 0;
		
		Queue<Person> Q = new LinkedList<>();
		
		for(int i = 0; i < N; i++) {
			Q.offer(new Person(i, arr[i]));
		}
		
		while(!Q.isEmpty()) {
			Person tmp = Q.poll();
			for(Person x : Q) {
				if(x.priority > tmp.priority) {
					Q.offer(tmp);
					tmp = null;
					break;
				}
			}
			if(tmp != null) {
				answer++;
				if(tmp.id == M) return answer;
			}
		}
		
		return answer;
	}
	
}

// 사람과 위험도를 한번에
class Person {
	int id;
	int priority;
	
	public Person(int id, int priority) {
		this.id = id;
		this.priority = priority;
	}
}
