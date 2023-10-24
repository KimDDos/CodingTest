class Solution {
    public String solution(String myString) {
        String answer = "";
        for(int i=0; i<myString.length(); i++){
            String str = myString.substring(i,i+1);
            if(str.equals("a") || str.equals("A")){
                answer += str.toUpperCase();
            } else{
                answer += str.toLowerCase();
            }
        }
        return answer;
    }
}