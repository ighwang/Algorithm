import java.util.*;

class Solution {
    public ArrayList<String> solution(String my_string) {
        ArrayList<String> answer = new ArrayList<>();
        // 1. 접미사 리스트 추가
        for(int i=0; i<my_string.length(); i++){
            answer.add(my_string.substring(i,my_string.length()));
        }
        // 2. 리스트 사전순으로 정렬
        Collections.sort(answer);
        return answer;
    }
}