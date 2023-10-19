import java.util.TreeSet;

class Solution {
    public int[] solution(int[] numbers) {
       TreeSet<Integer> tr = new TreeSet<Integer>();
		for(int i=0; i<numbers.length-1; i++) {
			for(int k=i+1; k<numbers.length; k++) {
				tr.add(numbers[i]+numbers[k]);
			}
		}
		int[] answer = new int[tr.size()];
		int cnt = 0;
		for(int c : tr) {
			answer[cnt] = c;
			cnt++;
		}
        return answer;
    }
}