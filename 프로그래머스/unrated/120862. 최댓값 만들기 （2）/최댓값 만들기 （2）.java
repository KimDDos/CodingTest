class Solution {
    public int solution(int[] numbers) {
        int Max = -2147483648;
		for(int i=0; i<numbers.length; i++) {
			for(int k=i+1; k<numbers.length; k++) {
				Max = isMax(Max, numbers[i], numbers[k]);
			}
		}
		
		int answer = Max;
        return answer;
    }
    public static int isMax(int Max, int num1, int num2) {
		int a = num1 * num2;
		return Math.max(Max, a);
	}
}