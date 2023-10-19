class Solution {
    public int solution(int a, int b) {
        int answer = 0;
		int A = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
		int B = Integer.parseInt(Integer.toString(b) + Integer.toString(a));
		if(A >= B) {
			answer = A;
		} else {
			answer = B;
		}
        return answer;
    }
}