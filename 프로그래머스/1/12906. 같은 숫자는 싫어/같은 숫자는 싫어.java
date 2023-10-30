import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=arr[i+1]) {
				list.add(arr[i]);
			} else if(i==arr.length-2) {
				if(arr[i-1]!=arr[i]) {
					list.add(arr[i]);
				}
				break;
			}
		}
		int[] answer = new int[list.size()];
		int cnt = 0;
		for(int a : list) {
			answer[cnt] = a;
			cnt++;
		}
        
        return answer;
    }
}