import java.math.BigInteger;

class Solution {
    public int solution(String number) {
        BigInteger input = new BigInteger(number);
        int answer = input.remainder(BigInteger.valueOf(9)).intValue();
		return answer;
    }
}