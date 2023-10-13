class Solution {
    public int solution(int n, int t) {
        for(int i=1; i<=t; i++) {
			int a = 2*n;
			n = a;
		}
		
		int answer = n;
        
        return answer;
    }
}