package lv0;

public class 나이출력 {
	public static void main(String args[]) {
		나이출력 agePrint = new 나이출력();
		int age = 22;
		System.out.println(agePrint.solution(age));
	}
	
	int solution(int age) {
	    int answer = 2022 - age +1;
	    return answer;
	}
}
