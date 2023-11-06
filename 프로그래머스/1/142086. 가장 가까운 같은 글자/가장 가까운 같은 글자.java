class Solution {
    public int[] solution(String s) {
        // s는 소문자로만 주어짐
		// 각 글자별로 자신보다 앞에 나왔으며, 같은 가장 가까운 곳에 있는 같은 글자가 거리가 얼마나 되는지
		char[] charArr = s.toCharArray();
		int[] answer = new int [s.length()];
		for(int i=0; i<s.length(); i++) {
			answer[i] = isContains(charArr, i);
		}
        
        return answer;
    }
    
    public static int isContains(char[] arr, int idx) {
		if(idx==0) return -1;
		char ch = arr[idx];
		for(int i=idx-1; i>=0; i--) {
			if(ch==arr[i]) {
				return idx - i;
			}
		}
		return -1;
	}
}