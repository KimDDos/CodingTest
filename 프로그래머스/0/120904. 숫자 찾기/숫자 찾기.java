class Solution {
    public int solution(int num, int k) {
        int answer = 0;
		String numStr = Integer.toString(num);
		for(int i=0; i<numStr.length(); i++) {
			if(numStr.substring(i, i+1).equals(Integer.toString(k))) {
				answer = i+1;
				break;
			} else {answer = -1;}
		}
        return answer;
    }
}