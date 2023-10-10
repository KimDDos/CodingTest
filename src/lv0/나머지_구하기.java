package lv0;

public class 나머지_구하기 {
	public static void main(String args[]) {
		나머지_구하기 remainder = new 나머지_구하기();
		int num1 = 4;
		int num2 = 5;
		System.out.println(remainder.solution(num1, num2));
	}
	
	int solution(int num1, int num2) {
	    int answer = Math.floorMod(num1, num2);
	    return answer;
	}
}
