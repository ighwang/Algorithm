import java.util.*;

class Solution {
    public ArrayList<String> solution(String my_string) {
        ArrayList<String> answer = new ArrayList<>();
        String[] str = my_string.split("\\s");
        
        for(String word : str){
            if(!word.equals("")){
                answer.add(word);
            }
        }
        return answer;
    }
}