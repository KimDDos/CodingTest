class Solution {
    public String solution(String my_string, int k) {
        String answer = "";
        int num = 0 ;
        while(num < k){
            answer += my_string;
            num++;
        }
        return answer;
    }
}