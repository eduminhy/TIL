import java.util.*;

	class Main{
		public String solution(String str) {
			String answer = "";
			for(char x:str.toCharArray()) {
				//대소문자확인 문법을 이용한 방법
				/*if(Character.isLowerCase(x)) answer += Character.toUpperCase(x);
				else answer += Character.toLowerCase(x);
				//isLowerCase(char) : 소문자라면 return true, 대문자라면 return false*/
				//2. 아스키코드 이용한 방법
				if(x>=97 && x<=122) answer += (char)(x-32);
				else answer += (char)(x+32);
			}
			return answer;
		}
		
		public static void main(String[] args) {
			Main T = new Main();
			Scanner kb = new Scanner(System.in);
			String str = kb.next();
			System.out.print(T.solution(str));
		}
	}
