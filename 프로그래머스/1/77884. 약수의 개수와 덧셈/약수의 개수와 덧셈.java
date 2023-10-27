class Solution {
    public int solution(int left, int right) {
        int mea = 0; // 약수 개수 구하기
        int odd = 0;
        int even = 0;
        for(int i=left; i<=right; i++){
            for(int k=1; k<=i; k++){
                if(i%k==0) mea++;
            }   
            if(mea%2==0){
                even += i;
            } else {
                odd += i;
            }
            mea=0;
        }
        
        int answer = even - odd;
        return answer;
    }
}