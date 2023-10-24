import java.util.*;

class Solution {
    public long solution(long n) {
        String str = Long.toString(n);
		String[] arr = new String[str.length()];
		for(int i=0; i<arr.length; i++) {
			arr[i] = str.substring(i, i+1);
		}
		Arrays.sort(arr, Collections.reverseOrder());
		str = "";
		for(String a : arr) {
			str += a;
		}
		long answer = Long.parseLong(str);
        return answer;
    }
}