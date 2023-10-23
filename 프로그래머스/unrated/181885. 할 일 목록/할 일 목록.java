import java.util.*;
class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i<todo_list.length; i++){
            if(finished[i]==false){
                list.add(todo_list[i]);
            }
        }
        
        String[] answer = new String[list.size()];
        int cnt = 0;
        for(String s : list){
            answer[cnt] = s;
            cnt++;
        }
        return answer;
    }
}