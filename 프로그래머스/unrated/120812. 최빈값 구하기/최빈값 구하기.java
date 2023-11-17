import java.util.*;

class Solution {
    public int solution(int[] array) {
        HashMap<Integer, Integer> myMap = new HashMap<>();
		HashSet<Integer> myArr = new HashSet<>();
		
		for(int a : array) {myArr.add(a);}
		for(int a : myArr) {myMap.put(a, 0);};
		for(int i=0; i<array.length; i++) {
			for(int tmp : myMap.keySet()) {
				if(tmp == array[i]) {
					myMap.put(tmp, myMap.get(tmp)+1);
					break;
				}
			}
		}
		
		int cnt = 0;
		int answer = 0;
		for(int tmp : myMap.keySet()) {
			cnt = Math.max(cnt, myMap.get(tmp));
			answer = Math.max(answer, myMap.get(tmp));
		}
		
		int cnt2 = 0;
		for(int tmp : myMap.keySet()) {
			if(cnt == myMap.get(tmp)) {
				cnt2++;
				answer = tmp;
			}
		}
		
		if(cnt2>=2) {
			answer = -1;
		}
        return answer;
    }
}