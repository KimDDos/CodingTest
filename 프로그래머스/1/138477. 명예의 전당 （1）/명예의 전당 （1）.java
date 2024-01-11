import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
		List<Integer> scoreList = new ArrayList<Integer>(); 
		
		for(int i=0; i<score.length; i++) {
			scoreList.add(score[i]);
			Collections.sort(scoreList);
			if(i<k) {
				answer[i] = scoreList.get(0);
			} else {
				answer[i] = scoreList.get(i-k+1); 
				
			}
		}
        return answer;
    }
	
}