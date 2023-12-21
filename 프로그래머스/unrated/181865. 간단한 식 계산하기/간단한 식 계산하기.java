class Solution {
    public int solution(String binomial) {
        int answer = 0;
		String op = binomial.substring(binomial.lastIndexOf(" ")-1,binomial.lastIndexOf(" "));
		int left = Integer.parseInt(binomial.substring(0,binomial.lastIndexOf(" ")-2));
		int right = Integer.parseInt(binomial.substring(binomial.lastIndexOf(" ")+1));
		
		switch (op) {
		case "+": answer = left + right; break;
		case "-": answer = left - right; break;
		case "*": answer = left * right; break;
		}
        return answer;
    }
}