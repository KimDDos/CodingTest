import java.lang.*;
import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
		char[] arr = s.toCharArray();
        Arrays.sort(arr);
        for(char a : arr){
            answer += String.valueOf(a);
        }
        StringBuffer str = new StringBuffer(answer);
		answer = str.reverse().toString();
        return answer;
    }
}