import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack stack = new Stack();

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==')' && stack.isEmpty()){
                answer = false;
                break;
            }else{
                if(s.charAt(i)=='('){
                    stack.push('(');
                }else{
                    stack.pop();
                }
            }
        }
        
        if(!stack.isEmpty()){
            answer = false;
        }

        return answer;
    }
}