package Coding_Test;

import java.util.Queue;

/*올바른 괄호란 두 개의 괄호 '(' 와 ')' 만으로 구성되어 있고, 괄호가 올바르게 짝지어진 문자열입니다. 괄호가 올바르게 짝지어졌다는 것은 '(' 문자로 열렸으면 반드시 짝지어서 ')' 문자로 닫혀야 합니다.
예를들어

()() 또는 (())() 는 올바른 괄호입니다.
)()( 또는 (()( 는 올바르지 않은 괄호입니다.
'(' 또는 ')' 로만 이루어진 문자열 s가 주어졌을 때, 문자열 s가 올바른 괄호이면 true를 return 하고, 올바르지 않은 괄호이면 false를 return하는 solution 함수를 완성해 주세요.

제한사항
문자열 s의 길이 : 100,000 이하의 자연수
문자열 s는 '(' 또는 ')' 로만 이루어져 있습니다.
s   answer
()()   true
(())()   true
)()(   false
(()(   false

*/

//처음이 ) 이면 무조건 false 
//배열이 1개면 무조건 false
//처음이 ( 이면 맨 마지막은 )가 아닐경우 false;

//결론은 처음과 끝이 ()이 어야지만 true;;

public class Test2 {

	public static void main(String[] args) {

		String a = "()()()";
		Queue<String> queue = Queue<String>;
		
		for(int i=0; i< a.length(); i++) {
			queue.add(a.charAt(i));
		}
		
		queue.peek();
		
		

	}

}
