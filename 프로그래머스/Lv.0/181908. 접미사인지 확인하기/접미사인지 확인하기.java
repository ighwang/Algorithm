import java.util.*;

class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        ArrayList<String> list = new ArrayList<>();
        
        for(int i=0; i<my_string.length(); i++){
            list.add(my_string.substring(i,my_string.length()));
        }
        for(int i=0; i<list.size(); i++){
            if(is_suffix.equals(list.get(i))){
                answer = 1;       
            }
        }
        return answer;
    }
}