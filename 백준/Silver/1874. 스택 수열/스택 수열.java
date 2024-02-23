import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();  // 테스트 케이스
		Stack<Integer> stackInt = new Stack<Integer>();
		StringBuilder sb = new StringBuilder(); 
		int start = 0;
		
		while (T--> 0) {
			
			int num = sc.nextInt();
			
			if(num > start) {
				for(int i=start + 1; i<=num; i++) {
					stackInt.push(i);
					sb.append("+").append("\n");
				}
				start = num;
			} else if(stackInt.peek() != num) {
				System.out.println("NO");
				return;
			}
			
			stackInt.pop();
			sb.append("-").append("\n");
		}
		System.out.println(sb);
	}
	
}
