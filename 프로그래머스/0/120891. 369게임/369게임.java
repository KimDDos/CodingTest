class Solution {
    public int solution(int order) {
        int answer = 0;
        
        String str = Integer.toString(order);
		int strLen = str.length();
		
		for(int i=0; i<strLen; i++) {
			String tmp = str.substring(i, i+1);
			if(tmp.equals("3")) answer++;
			if(tmp.equals("6")) answer++;
			if(tmp.equals("9")) answer++;
		}
        
        return answer;
    }
}