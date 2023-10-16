class Solution {
    public int solution(int a, int b, int n) {
        int q = 0;
        int r = 0; 
        int sum = 0;

        while( n >= a ) {
            q = n / a; //몫 : 8
            r = n % a; //나머지 : 0
            n = q*b+r; //현재병개수
            sum += q*b;
        }
        return sum;
    }
}