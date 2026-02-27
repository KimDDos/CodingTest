class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        
        String condition = ineq + eq;
    
        if (condition.equals("<=")) {
            answer = n <= m ? 1 : 0;
        } else if (condition.equals("<!")) {
            answer = n < m ? 1 : 0;
        } else if (condition.equals(">=")) {
            answer = n >= m ? 1 : 0;
        } else if (condition.equals(">!")) {
            answer = n > m ? 1 : 0;
        }
        
        return answer;
    }
}