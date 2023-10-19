class Solution {
    public int solution(int n) {
        int answer = 0;
        String tri = Integer.toString(n,3);
        StringBuffer str = new StringBuffer(tri);
        String revstr = str.reverse().toString();
        answer = Integer.parseInt(revstr,3);
        return answer;
    }
}