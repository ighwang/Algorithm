import java.util.*;

class Solution {
    public ArrayList<String> solution(String[] strArr) {
        ArrayList<String> answer = new ArrayList<>();
        
        for(String word : strArr){
            boolean isCheck = true;
            
            if(word.length()>=2){
                for(int i=0; i<=word.length()-2; i++){
                    if(word.substring(i,i+2).equals("ad")){
                        isCheck = false;
                        break;
                    }
                }    
            }
            if(isCheck){
                answer.add(word);
            }
        }
        return answer;
    }
}