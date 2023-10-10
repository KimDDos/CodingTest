package lv0;

public class 숫자비교 {
	public static void main(String args[]) {
		숫자비교 comparison = new 숫자비교();
		System.out.println(comparison.solution(2, 3));
	}
	
	int solution(int num1, int num2) {
		int answer = 0;
		if(num1 == num2) {
			answer = 1;
		} else {
			answer = -1;
		}
	    return answer;
	}
}
