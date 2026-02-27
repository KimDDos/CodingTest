class Solution {
    public int solution(int a, int b) {
        int answer = Math.max(a,b);
        int temp1 = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int temp2 = Integer.parseInt(String.valueOf(b) + String.valueOf(a));
        
        if(temp1 > temp2){
          answer = temp1;
        } else {
          answer = temp2;
        }
        
        return answer;
    }
}