class Solution {
    public int solution(int[][] sizes) {
        int[][] arr = new int[sizes.length][sizes[0].length];
		int wMax = 0;
		int hMax = 0;
		
		
		for(int i=0; i<sizes.length; i++) {
			arr[i][0] = Math.max(sizes[i][0], sizes[i][1]);
			arr[i][1] = Math.min(sizes[i][0], sizes[i][1]);
		}
		
		for(int i=0; i<arr.length; i++) {
			wMax = Math.max(wMax, arr[i][0]);
			hMax = Math.max(hMax, arr[i][1]);
		}
		
		int answer = wMax*hMax;
        return answer;
    }
}