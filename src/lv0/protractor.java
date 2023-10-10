package lv0;

public class protractor {
	public static void main(String args[]) {
		protractor pro = new protractor();
		System.out.println(pro.solution(123));
	}
	
	int solution(int angle) {
	    int answer = 0;
	    if(0<angle && angle <90) {
	    	answer = 1;
	    } else if(angle == 90) {
	    	answer = 2;
	    } else if(90<angle && angle <180) {
	    	answer = 3;
	    } else if(angle == 180) {
	    	answer = 4;
	    } else {
	    	answer = -1;
	    }
	    return answer;
	}
}
