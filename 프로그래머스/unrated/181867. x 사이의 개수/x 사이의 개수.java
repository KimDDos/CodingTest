class Solution {
    public int[] solution(String myString) {
        int cnt = 0;
		for(int i=0; i<myString.length(); i++) {
			if(myString.charAt(i)=='x') cnt++;
		}
		String[] str = myString.split("x");
		
		int[] answer = new int[cnt+1];
		for(int i=0; i<str.length; i++) {
			answer[i] = str[i].length();
		}
		if(answer.length>str.length) {
			answer[answer.length-1] = 0;
		}
        return answer;
    }
}