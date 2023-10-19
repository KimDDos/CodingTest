class Solution {
    public int[] solution(String s) {
		String rep = "";
		int[] answer = new int[2];
		int cnt1 = 0;
		int cnt2 = 0;
		while(!s.equals("1")) {
			rep = s.replace("0","");
			cnt2 += s.length()-rep.length();
			s = Integer.toBinaryString(rep.length());
			cnt1++;
		}
		answer[0] = cnt1;
		answer[1] = cnt2;
        return answer;
    }
}