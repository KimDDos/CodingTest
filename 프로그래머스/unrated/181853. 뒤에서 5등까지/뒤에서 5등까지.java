import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
    ArrayList<Integer> list = new ArrayList<Integer>();
		Arrays.sort(num_list);
		for(int i=0; i<5; i++){
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