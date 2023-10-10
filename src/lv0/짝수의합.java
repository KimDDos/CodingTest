package lv0;

public class 짝수의합 {
	public static void main(String args[]) {
		짝수의합 sum = new 짝수의합();
		System.out.println(sum.solution(10));
	}
	
	int solution(int n) {
		int answer = 0;
		for(int i=1; i<=n; i++) {
			if(i%2==0) answer += i;
		}
	    return answer;
	}
}
