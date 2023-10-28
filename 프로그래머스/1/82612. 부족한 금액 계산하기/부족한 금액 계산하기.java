class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long total = 0;
		for(int i=1; i<=count; i++) {
			total += (long)(price * i);
		}
        answer = money-total;
		if(answer<0) {
			answer = answer*(-1);
		} else {
			answer = 0;
		}
        return answer;
    }
}