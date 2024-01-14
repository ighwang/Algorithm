import java.util.*;

class Solution {
    public ArrayList<String> solution(String myString) {
        ArrayList<String> answer = new ArrayList<>();
        String[] arr = myString.split("x");
        
        for(String word : arr){
            if(!word.equals("")){
                answer.add(word);
            }
        }
        Collections.sort(answer);
        return answer;
    }
}