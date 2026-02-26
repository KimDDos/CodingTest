class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int num = 1;
        int x = 0, y = 0;
        int minX = 0, minY = 0;
        int maxX = n-1, maxY = n-1;
        int turn = 0;
        answer[0][0] = num;
        while (num < (n*n)) {
         if(turn % 4 == 0){
            y++;
            num++;
            if(y == maxY) turn++;
          } else if(turn % 4 == 1){
            x++;
            num++;
            if(x == maxX) turn++;
          } else if(turn % 4 == 2){
            y--;
            num++;
            if(y == minY) turn++;
          } else if(turn % 4 == 3){
            x--;
            num++;

           if(x == minX + 1){
              turn = 0;
              minX++;
              minY++;
              maxX--;
              maxY--;
            }
          }

          answer[x][y] = num;
        }
        return answer;
    }
}