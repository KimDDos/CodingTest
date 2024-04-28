import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String str = my_string.toLowerCase();
		
		String strArr[] = str.split("");
		Arrays.sort(strArr);
		
		String answer = "";
		for(String aa : strArr) {
			answer += aa;
		}
        
        return answer;
    }
}