import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String str = "";
		char[] arr = my_string.toCharArray();
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=' ') {
				str += String.valueOf(arr[i]);
			}
			if(arr[i]==' ' && i>0 && arr[i-1]!=' ') {
				str += " ";
			}
		}
		
		
		String[] answer = str.split(" ");
        return answer;
    }
}