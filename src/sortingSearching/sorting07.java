package sortingSearching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class sorting07 {

	public static void main(String[] args) {
		
		/*
		 * 좌표 정렬
		 * 
		 * N개의 평면상의 좌표가 주어지면 모든 좌표를 오름차순으로 정렬하는 프로그램 작성.
		 * 정렬기준은 먼저 x 값의 의해서 정렬, x 값이 같을 경우 y값에 의해 정렬.
		 * 
		 * - 입력
		 * 첫째 줄에 좌표의 개수인 N이 주어짐.
		 * 두 번째 줄부터 N개의 좌표가 x, y  순으로 주어짐. x, y값은 양수만 입력.
		 * 
		 * - 출력
		 * N개의 좌표를 정렬하여 출력.
		 * 
		 * ex)
		 * 5
		 * 2 7		1 2
		 * 1 3		1 3	
		 * 1 2		2 5
		 * 2 5		2 7
		 * 3 6 	-> 	3 6
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		ArrayList<Point> arr = new ArrayList<>();
		for(int i = 0 ; i < N; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			arr.add(new Point(x,y));
		}
		
		Collections.sort(arr);
		
		for(Point result : arr) {
			System.out.println(result.x + " " + result.y);
		}
		
		scan.close();
		
	}
	
}

class Point implements Comparable<Point> {
	public int x, y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int compareTo(Point o) {
		if(this.x == o.x) {
			// this 가 앞에 있으면 -> 음성이 나오게 됨. 음수 리턴해야함. (작은거-큰거)
			return this.y-o.y;
		} else {
			return this.x-o.x;
		}
	}
}
