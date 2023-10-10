package lv0;

public class 몫_구하기 {
	public static void main(String args[]) {
		몫_구하기 quotient = new 몫_구하기();
		int num1 = 15;
		int num2 = 12;
		System.out.println(quotient.solution(num1, num2));
	}
	
	int solution(int num1, int num2) {
	    int answer = Math.floorDiv(num1, num2);
	    return answer;
	}
}
