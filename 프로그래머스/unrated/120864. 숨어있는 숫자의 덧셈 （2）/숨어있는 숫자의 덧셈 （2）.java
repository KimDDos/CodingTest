import java.util.*;

class Solution {
    public int solution(String my_string) {
        String str = my_string.replaceAll("[a-zA-Z]", " ");
		String arr[] = str.split(" ");
		ArrayList<Integer> list = new ArrayList<Integer>();
		int answer = 0;
		for(String a : arr) {
			if(!a.equals("")) {
				list.add(Integer.parseInt(a));
			}
		}
		for(int a : list) {
			answer += a;
		}
        return answer;
    }
}