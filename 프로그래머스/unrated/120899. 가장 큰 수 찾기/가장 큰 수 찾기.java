class Solution {
    public int[] solution(int[] array) {
        int result = 0;
        for(int i=0; i<array.length-1; i++){
            result = ismax(array[i], array[i+1]);
        }
        
        int idx = 0;
        for(int a : array){
            if(a == result){
                break;
            }
            idx++;
        }
        
        int[] answer = {result, idx};
        return answer;
    }
    
    public static int ismax(int num1, int num2){
        int result = Math.max(num1, num2);
        return result;
    }
}