class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int temp1 = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int temp2 = 2 * a * b;
        if(temp1 > temp2){
          answer = temp1;
        } else {
          answer = temp2;
        }
        return answer;
    }
}