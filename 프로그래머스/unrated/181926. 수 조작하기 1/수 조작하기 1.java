class Solution {
    public int solution(int n, String control) {
        int answer = n;
        for(int i=0; i<control.length(); i++){
            answer += wasd(control.charAt(i));
        }
        return answer;
    }
    
    public int wasd(char ch){
        int num = 0;
        switch(ch){
            case 'w': num = 1; break;
            case 's': num = -1; break;
            case 'd': num = 10; break;
            case 'a': num = -10; break;
            default: break;
        }
        return num;
    }
}