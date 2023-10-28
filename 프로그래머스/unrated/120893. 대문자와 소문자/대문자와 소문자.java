class Solution {
    public String solution(String my_string) {
        String answer = "";
		for(char a : my_string.toCharArray()) {
			if(64<a && a<91) {
				answer += (Character.toString(a)).toLowerCase();
			} else{
				answer += (Character.toString(a)).toUpperCase();
			}
		}
        return answer;
    }
}