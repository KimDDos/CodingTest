class Solution {
    public int solution(int[][] board) {
        Solution ma = new Solution();
		int cnt = 0;
		int[][] arr = new int[board.length][board.length];
		for(int i=0; i<board.length; i++) {
        	for(int k=0; k<board[i].length; k++) {
        		if(board[i][k]==1) {
        			if(ma.dangerZone(i-1, k-1, board.length)==1) arr[i-1][k-1] = 1;
        			if(ma.dangerZone(i-1, k, board.length)==1) arr[i-1][k] = 1;
        			if(ma.dangerZone(i-1, k+1, board.length)==1) arr[i-1][k+1] = 1;
        			if(ma.dangerZone(i, k-1, board.length)==1) arr[i][k-1] = 1;
        			if(ma.dangerZone(i, k, board.length)==1) arr[i][k] = 1;
        			if(ma.dangerZone(i, k+1, board.length)==1) arr[i][k+1] = 1;
        			if(ma.dangerZone(i+1, k-1, board.length)==1) arr[i+1][k-1] = 1;
        			if(ma.dangerZone(i+1, k, board.length)==1) arr[i+1][k] = 1;
        			if(ma.dangerZone(i+1, k+1, board.length)==1) arr[i+1][k+1] = 1;
        		}
        	}
        }
		
		for(int i=0; i<board.length; i++) {
        	for(int k=0; k<board[i].length; k++) {
        		if(arr[i][k]!=1) {
        			cnt++;
        		}
        	}
        }
		
		int answer = cnt;
        return answer;
    }
    
    public int dangerZone(int x, int y, int n) {
		if(x<0 || x>=n || y<0 || y>=n) return -1;
		return 1;
	}
}