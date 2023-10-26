class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        for(int a : numbers){
            answer += a;
        }
        answer = 45 - answer;
        return answer;
    }
}