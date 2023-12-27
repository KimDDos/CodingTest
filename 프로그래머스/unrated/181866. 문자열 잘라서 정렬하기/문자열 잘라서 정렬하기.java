import java.util.Arrays;

class Solution {
    public String[] solution(String myString) {
        String[] tmpArr = myString.split("x");
		int length = 0;
		for(String tmp : tmpArr) {
			if(!tmp.equals("") && !tmp.equals(null)) {
				length++;
			} 
		}
		String[] answer = new String[length];
		for(int i=0; i<tmpArr.length; i++) {
			if(!tmpArr[i].equals("") && !tmpArr[i].equals(null)) {
				answer[--length] = tmpArr[i]; 
			}
		}
		Arrays.sort(answer);
        return answer;
    }
}