class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for(int tmp : array){
            if(tmp > height){
                answer += 1;
            }
        }
        return answer;
    }
}