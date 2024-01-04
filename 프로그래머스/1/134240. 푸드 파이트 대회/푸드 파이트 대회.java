import java.util.*;

class Solution {
    public String solution(int[] food) {
        String answer = "";
		
		for(int i=1; i<food.length; i++) {
			if(food[i] >= 2) {
				int result = (int)Math.floor(food[i] / 2);
				for(int k=0; k<result; k++) { answer += i; }
			}
		}
		StringBuffer sb = new StringBuffer(answer); 
		answer += "0" + sb.reverse().toString();
        return answer;
    }
}