class Solution {
    public int[] solution(int[] num_list) {
        int end = num_list.length-1;
        int[] answer = new int[end+2];
        System.arraycopy(num_list, 0, answer, 0, end+1);
        if(num_list[end]>num_list[end-1]){
            answer[end+1] = num_list[end] - num_list[end-1];
        } else if(num_list[end]<=num_list[end-1]){
            answer[end+1] = 2*num_list[end];   
        }
        return answer;
    }
}