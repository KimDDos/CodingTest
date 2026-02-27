class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        
        for(int i=1; i<numLog.length; i++){
          int move = numLog[i] - numLog[i-1];

          if(move == 1){
            answer += "w";
          } else if(move == -1){
            answer += "s";
          } else if(move == 10){
            answer += "d";
          } else {
            answer += "a";
          }
        }
        
        return answer;
    }
}