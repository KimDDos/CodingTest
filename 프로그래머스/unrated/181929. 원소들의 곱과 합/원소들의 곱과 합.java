class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 1;
        int rem = 0;
        for(int i=0; i<num_list.length; i++){
            sum = sum * num_list[i];
            rem += num_list[i];
            if(i==num_list.length-1) rem = rem*rem;
        }
        if(sum < rem){
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }
}