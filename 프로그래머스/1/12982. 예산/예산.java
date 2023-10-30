import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int sum = 0;
		int cnt = 0;
		Arrays.sort(d);
		for(int a : d) {
			if((sum+a)<=budget) {
				sum += a;
				cnt++;
			}
		}
		
		int answer = cnt;
        return answer;
    }
}