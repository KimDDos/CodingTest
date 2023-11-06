import java.util.*;

class Solution {
    public int solution(String s) {
        HashMap<String, String> myMap = new HashMap<>();
		String str = "";
		String ans = "";
		
		myMap.put("zero", "0");
		myMap.put("one", "1");
		myMap.put("two", "2");
		myMap.put("three", "3");
		myMap.put("four", "4");
		myMap.put("five", "5");
		myMap.put("six", "6");
		myMap.put("seven", "7");
		myMap.put("eight", "8");
		myMap.put("nine", "9");
		for(int i=0; i<s.length(); i++) {
			if(Character.isDigit(s.charAt(i))) {
				ans += Integer.parseInt(s.substring(i, i+1)); 
			} else {
				str += s.substring(i, i+1);
			}
			for(String m : myMap.keySet()) {
				if(str.equals(m)) {
					ans += myMap.get(m);
					str = "";
					break;
				}
			}
		}
		
		int answer = Integer.parseInt(ans);
        return answer;
    }
}