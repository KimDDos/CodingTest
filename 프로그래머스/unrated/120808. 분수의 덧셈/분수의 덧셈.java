class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int multi = (denom1*denom2) / getGCD(denom1, denom2);
		
		int num = (numer1 * (multi/denom1)) + (numer2 * (multi/denom2));
		int num2 = getGCD(num, multi);
		int[] answer = new int[2];
		answer[0] = num / num2;
		answer[1] = multi / num2;
        return answer;
    }
    
    public static int getGCD(int num1, int num2) {
		if(num1 % num2 ==0) {
			return num2;
		}
		return getGCD(num2, num1%num2);
	}
}