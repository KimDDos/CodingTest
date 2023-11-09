class Solution {
    public String solution(String s) {
        String[] str = s.split(" ");
		int max = -2147483648;
		int min = 2147483647;
		for(int i=0; i<str.length; i++) {
			int a = Integer.parseInt(str[i]);
			max = Math.max(max, a);
			min = Math.min(min, a);
		}
		
		String answer = ""+min+" "+max;
        return answer;
    }
}