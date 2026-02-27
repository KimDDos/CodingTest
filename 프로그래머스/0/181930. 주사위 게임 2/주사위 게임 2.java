class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        int match = 0;

        if(a == b){
          match++;
        }
        if(a == c){
          match++;
        }
        if(b == c){
          match++;
        }

        if(match == 0){
          answer = a + b + c;
        }else if(match == 1){
          answer = (a+b+c) * (a*a + b*b + c*c);
        }else if(match == 3){
          answer = (a+b+c) * (a*a + b*b + c*c) * (a*a*a + b*b*b + c*c*c);
        }
        return answer;
    }
}