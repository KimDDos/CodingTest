class Solution {
    public int solution(int[] box, int n) {
        int x = box[0] / n;
        int y = box[1] / n;
        int h = box[2] / n;
        
        int answer = x * y * h;
        return answer;
    }
}