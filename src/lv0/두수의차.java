package lv0;

public class 두수의차 {
	public static void main(String args[]) {
		두수의차 minus = new 두수의차();
		int num1 = 300;
		int num2 = 250;
		System.out.println(minus.solution(num1, num2));
	}
	
	int solution(int num1, int num2) {
	    int answer = num1 - num2;
	    return answer;
	}
}
