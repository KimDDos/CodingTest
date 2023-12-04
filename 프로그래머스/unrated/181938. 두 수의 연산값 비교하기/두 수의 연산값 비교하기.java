class Solution {
    public int solution(int a, int b) {
        int count = 0;
        String str = "";
        int answer = 0;
        
        while(count < 2){
            String str1 = Integer.toString(a);
            String str2 = Integer.toString(b);
            if(count % 2 == 1){
                str = str1 + str2;
            }else{
                answer = 2 * a * b;        
            }
            count++;
        }
        
        answer = Math.max(Integer.parseInt(str),answer);
        return answer;
    }
}