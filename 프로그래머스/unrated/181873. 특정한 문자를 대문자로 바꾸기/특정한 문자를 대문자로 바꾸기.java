class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++){
            String str = my_string.substring(i,i+1);
            if(alp.equals(str)){
                answer += str.toUpperCase();
            } else answer += my_string.substring(i,i+1);
        }
        return answer;
    }
}