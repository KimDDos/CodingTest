package lv0;
/* 문자열 my_string이 매개변수로 주어집니다. 
 * my_string을 거꾸로 뒤집은 문자열을 return하도록 
 * solution 함수를 완성해주세요.
 * */
public class 문자열_뒤집기 {
	public String solution(String my_string) {
		String answer = my_string;
        String tmp = "";
        int i = my_string.length()-1;
        while(i>=0){
            tmp += answer.charAt(i);
            i--;
        }
        answer = tmp;
        return answer;
    }
}
