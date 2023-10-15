
class Solution {
    public String[] solution(String[] names) {
        int size = 0;
        if(names.length%5!=0){
            size = names.length/5+1;
        } else {
            size = names.length/5;
        }
        String[] answer = new String[size];
        int cnt=0;
        for(int i=0; i<names.length; i++){
            if(i%5==0 || i==0){
                answer[cnt] = names[i];
                cnt++;   
            }
        }
        return answer;
    }
}