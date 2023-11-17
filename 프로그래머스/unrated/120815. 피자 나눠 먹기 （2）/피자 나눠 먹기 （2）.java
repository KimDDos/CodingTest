class Solution {
    public int solution(int n) {
        int answer = lcm(6,n) / 6;
        return answer;
    }
    
    
    // 최대 공약수 구하기
    public static int gcd(int a, int b){
        if(a%b==0){
            return b;
        }
        return gcd(b, a%b);
    }
    
    // 최소공배수
    public static int lcm(int a, int b){
        return a*b / gcd(a,b);
    }
    
}