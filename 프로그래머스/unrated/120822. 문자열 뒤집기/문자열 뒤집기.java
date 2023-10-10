class Solution {
    public String solution(String my_string) {
        String answer = my_string;
        String tmp = "";
        int i = my_string.length()-1;
        while(i>=0){
            tmp += answer.charAt(i);
            i--;
        }
        answer = tmp;
        return answer;
    }
}