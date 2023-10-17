class Solution {
    public String[] solution(String[] quiz) {
     String[] answer = new String[quiz.length];
        int k = 0;
        for(int i=0; i<quiz.length; i++){
            String[] str = quiz[i].split(" ");
            int num1 = Integer.parseInt(str[0]);
            int num2 = Integer.parseInt(str[2]);
            int num3 = Integer.parseInt(str[4]);
            char ch = str[1].charAt(0);
            switch (ch) {
			case '+':
				int add = num1 + num2;
				answer[k] = (add == num3) ? "O":"X";
				k++;
				break;
			case '-':
				add = num1 - num2;
				answer[k] = (add == num3) ? "O":"X";
				k++;
				break;
			default: break;
			}
        }
        
        return answer;
    }
}