class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int cards1Cnt = 0;
		int cards2Cnt = 0;
		String answer = "Yes";

		for(int i=0; i<goal.length; i++) {
			if(goal[i].equals(cards1[cards1Cnt])) {
				if(cards1.length - 1 != cards1Cnt) {
					cards1Cnt++;
				}
			} else if(goal[i].equals(cards2[cards2Cnt])) {
				if(cards2.length - 1 != cards2Cnt) {
					cards2Cnt++;
				}
			} else {
				answer = "No";
				break;
			}
		}
        return answer;
    }
}