class Solution {
    public int[] solution(int[] num_list) {
        int i = num_list.length-1;
        int k = 0;
        int[] answer = new int[num_list.length];
        while(i >= 0){
            answer[k] = num_list[i];
            i--;
            k++;
        }
        return answer;
    }
}