class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int same = 0;
		int mis = 0;
		
		for(int a : lottos) {
			if(a==0) mis++;
			for(int b : win_nums) {
				if(a == b) same++;
			}
		}
		
		int lottoMax = same+mis;
		int lottoMin = same;
		
		int[] answer = {isRank(lottoMax), isRank(lottoMin)};
        return answer;
    }
    
    public static int isRank(int num) {
		
		switch (num) {
		case 6: num = 1; break;
		case 5: num = 2; break;
		case 4: num = 3; break;
		case 3: num = 4; break;
		case 2: num = 5; break;
		case 1: num = 6; break;
		case 0: num = 6; break;
		default: break;
		}
		return num;
	}
}