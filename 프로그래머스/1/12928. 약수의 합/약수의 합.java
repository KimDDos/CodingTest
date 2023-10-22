import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(n%i==0) list.add(i);
        }
        
        for(int a : list) answer += a;
        return answer;
    }
}