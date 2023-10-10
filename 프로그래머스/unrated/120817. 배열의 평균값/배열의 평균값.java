class Solution {
    public double solution(int[] numbers) {
        double avg = 0;
        for(int i=0; i<numbers.length; i++){
            avg += numbers[i];
        }
        double answer = avg / numbers.length;
        return answer;
    }
}