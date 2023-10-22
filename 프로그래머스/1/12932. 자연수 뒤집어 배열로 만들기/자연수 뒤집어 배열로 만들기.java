import java.util.*;

class Solution {
    public int[] solution(long n) {
        ArrayList<Long> list = new ArrayList<>();
		String str = Long.toString(n);
		for(int i=str.length()-1; i>=0; i--) {
			list.add((long)(Integer.parseInt(str.substring(i, i+1))));
		}
		
		int[] answer = new int[list.size()];
		int cnt = 0;
		for(long a : list) {
			answer[cnt] = (int)a;
			cnt++;
		}
        return answer;
    }
}