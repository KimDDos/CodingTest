class Solution {
    public String solution(String s, int n) {
        // a-z : 97 ~ 122
        // A-Z : 65 ~ 90
        String answer = "";
        // a-z : 97 ~ 122
        // A-Z : 65 ~ 90
		for(int i=0; i<s.length(); i++) {
			answer += move(s.charAt(i), n);
		}
        return answer;
    }
    
    public static String move(char ch, int n) {
		String str = "";
		if(65 <= ch && ch <= 90) {
			if(ch+n > 90) {
				str = Character.toString((ch+n - 90) + 64);
			} else {
				str = Character.toString(ch+n);
			}
		} else if(97 <= ch && ch <= 122) {
			if(ch+n > 122) {
				str = Character.toString((ch+n - 122) + 96);
			} else {
				str = Character.toString(ch+n);
			}
		} else if(ch == ' ') {
			str = " ";
		}
		return str;
	}
}