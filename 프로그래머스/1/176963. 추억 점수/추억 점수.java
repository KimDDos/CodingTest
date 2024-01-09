class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
		
		for(int i=0; i<answer.length; i++) {
			for(int k=0; k<photo[i].length; k++) {
				for(int q=0; q<name.length; q++) {
					if(photo[i][k].equals(name[q])) {
						answer[i] += yearning[q];
					}
				}
			}
		}
        return answer;
    }
}