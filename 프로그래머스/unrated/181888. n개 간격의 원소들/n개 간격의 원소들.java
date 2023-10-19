import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<num_list.length; i+=n){
			list.add(num_list[i]);
		}
		int cnt = 0;
		int[] answer = new int[list.size()];
		for(int tmp : list) {
			answer[cnt] = tmp;
			cnt++;
		}
        return answer;
    }
}