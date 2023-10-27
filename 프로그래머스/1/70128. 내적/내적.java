class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        for(int i=0; i<a.length; i++){
            for(int k=0; k<b.length; k++){
                if(i==k) answer += a[i]*b[k];
            }
        }
        return answer;
    }
}