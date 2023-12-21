import java.util.ArrayList;

class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> list = new ArrayList<String>();
		
		for(String a : strArr) {
			if(!a.contains("ad")) list.add(a);
		}
		
		String[] answer = new String[list.size()];
		for(int i=0; i<list.size(); i++) {
			answer[i] = list.get(i);
		}
        return answer;
    }
}