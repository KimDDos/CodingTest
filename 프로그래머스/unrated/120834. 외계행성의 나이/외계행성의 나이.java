class Solution {
    public String solution(int age) {
        String answer = Integer.toString(age);
		String tmp = ""; 
		
		// 'a'의 int는 97
		for(int i =0; i<answer.length(); i++) {
			String num = answer.substring(i, i+1);
			System.out.println(num);
			int num1 = Integer.parseInt(num);
			char ch = (char)(num1 + 97);
			tmp += "" + ch;
		}
        return tmp;
    }
}