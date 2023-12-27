class Solution {
    public int[] solution(int[] numbers, String direction) {
        switch (direction) {
		case "right":
			int right = numbers[numbers.length-1];
			for(int i=numbers.length-1; i>=1; i--) {
				numbers[i] = numbers[i-1]; 
			}
			numbers[0] = right;
			break;
		case "left":
			int left = numbers[0];
			for(int i=0; i<numbers.length-1; i++) {
				numbers[i] = numbers[i+1]; 
			}
			numbers[numbers.length-1] = left;
			break;
		}
        return numbers;
    }
}