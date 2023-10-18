class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int a = arr1.length;
        int b = arr2.length;
        if(a==b){
            a = 0;
            b = 0;
            for(int i=0; i<arr1.length; i++){
                a += arr1[i];
                b += arr2[i];
            }
            answer = a>b ? 1:(a==b? 0:-1); 
        } else if(a!=b){
            answer = a>b ? 1:-1;
        }
        return answer;
    }
}