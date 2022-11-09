import java.util.*;

	class Main{
		public int solution(String str, char t) {
			int answer = 0;
			str = str.toUpperCase();//String을 다 대문자로 변경
			t = Character.toUpperCase(t);//char을 다 대문자로 변경
				/*System.out.println(str+' '+t);
				for(int i=0;i<str.length();i++) {
					if(str.charAt(i)==t){//String의 index 하나하나 확인
						answer++;
					}
				}*/
			for(char x : str.toCharArray()){foreach로 돌릴 때는 String으로 할 수 없다. 문자열로 변경해야 한다.
				if(x==t) answer++;
			}
			return answer;
		}
			
		public static void main(String[] args) {
			Main T = new Main();
			Scanner kb = new Scanner(System.in);
			String str = kb.next();
			char c = kb.next().charAt(0);//next()는 String이므로 char로 바꾸기 위해서는 charAt(0)을 사용해야 한다.
			System.out.print(T.solution(str, c));
		}
	}
