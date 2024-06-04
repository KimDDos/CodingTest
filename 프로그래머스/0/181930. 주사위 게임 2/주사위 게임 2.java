class Solution {
    public int solution(int a, int b, int c) {
        int answer = numCheck(a, b, c);
        return answer;
    }
    
    public static int numCheck(int a, int b, int c) {
		int answer = 0;
		int cal1 = a + b + c;
		int cal2 = ((int)Math.pow(a, 2) + (int)Math.pow(b, 2) + (int)Math.pow(c, 2));
		int cal3 = ((int)Math.pow(a, 3) + (int)Math.pow(b, 3) + (int)Math.pow(c, 3));
		if(a != b && b != c && c != a) {
			answer = cal1;
		}
		if((a == b && b != c) || (b == c && c != a) || (c == a && a != b)) {
			answer = cal1 * cal2;
		}
		if(a == b && b == c && c == a) {
			answer = cal1 * cal2 * cal3;
		}
		return answer;
	}
}