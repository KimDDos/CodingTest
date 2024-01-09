import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
		String[] tempArr1 = toBinaryStr(n, arr1);
		String[] tempArr2 = toBinaryStr(n, arr2);
		
		for(int i=0; i<n; i++) {
			answer[i] = "";
			for(int k=0; k<n; k++) {
				if(tempArr1[i].substring(k, k+1).equals("0") && tempArr2[i].substring(k, k+1).equals("0")) {
					answer[i] += " ";
				} else {
					answer[i] += "#";
				}
			} 
		}
        return answer;
    }
    
    public static String[] toBinaryStr(int n, int[] arr) {
		String[] tempStrArr = new String[n]; 
	    for(int i=0; i<n; i++) {
	        String binaryString = String.format("%" + n + "s", Integer.toBinaryString(arr[i])).replace(' ', '0');
	        tempStrArr[i] = binaryString;
	    }
		return tempStrArr;
	}
}