package lv0;

public class 두수의곱 {
	
	public static void main(String args[]) {
		두수의곱 multi = new 두수의곱();
		int answer = multi.solution(4,5);
		System.out.println(answer);
	}
	
	public int solution(int num1, int num2) {
	    int answer = num1 * num2;
	    return answer;
	}
	
}

