import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=l; i<= r; i++){
          String s = String.valueOf(i);
          String regex = "^[05]+$";
          if(s.matches(regex)){
            list.add(i);
          }
        }
        
        if(list.size() == 0){
          list.add(-1);
        } 

        int[] answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }
}