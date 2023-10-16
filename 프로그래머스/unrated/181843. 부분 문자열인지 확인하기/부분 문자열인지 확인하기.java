class Solution {
    public int solution(String my_string, String target) {
        int answer = 0;
        for(int i=0; i<my_string.length(); i++){
            for(int k=my_string.length(); k>i; k--){
                String str = my_string.substring(i,k);
                if(target.equals(str)){
                    answer = 1;
                }
            }
        }
        
        return answer;
    }
}