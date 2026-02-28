class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        
        for(int i=0; i<queries.length; i++){
          int a = 0;
          int b = 0;
          for(int j=0; j<queries[i].length; j++){
            if(j == 0){
              a = queries[i][j];
            } else {
              b = queries[i][j];
            }
          }
          int temp = arr[a];
          arr[a] = arr[b];
          arr[b] = temp;
        }

        for(int i=0; i<arr.length; i++){
          answer[i] = arr[i];
        }
        
        return answer;
    }
}