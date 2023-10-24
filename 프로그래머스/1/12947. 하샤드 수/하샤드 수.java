class Solution {
    public boolean solution(int x) {
        String str = Long.toString(x);
		long num = 0;
		String[] arr = str.split("");
		for(String a : arr) num+=Integer.parseInt(a);
		boolean answer = false;
		if(x%num == 0) {
			answer = true;
		}
        return answer;
    }
}