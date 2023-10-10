class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int size = num2 - num1 + 1;
        int[] answer = new int[size];
        int k = 0;
        for(int i=0; i<numbers.length; i++){
            if(i>=num1 && i<=num2){
                answer[k] = numbers[i];
                k++;
            }
        }
        return answer;
    }
}