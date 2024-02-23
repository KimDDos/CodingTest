import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int T = sc.nextInt();
		
		while (T--> 0) {
			String str = sc.next();
			// str의 길이가 짝수가 아니면 짝이 맞지 않음
			if(str.length() % 2 == 0) {
				int left = 0;
				int right = 0;
				for(int i = 0;  i<str.length(); i++) {
					String tmp = str.substring(i, i+1);
					if(tmp.equals("(")) {
						left++;
					}else {
						right++;
					}
					if(right > left) {
						break;
					}
				}
				if(left == right) {
					sb.append("YES").append("\n");
				} else {
					sb.append("NO").append("\n");
				}
			} else {
				sb.append("NO").append("\n");
			} 
		}
		System.out.println(sb);
	}
}