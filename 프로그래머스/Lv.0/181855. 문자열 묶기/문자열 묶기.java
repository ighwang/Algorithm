import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int size = 1;
        int num = 0;
        ArrayList<Integer> counts = new ArrayList<>();
        
        while(num<strArr.length){
            int cnt = 0;
            
            for(String word : strArr){
                if(word.length()==size){
                    cnt++;
                    num++;
                }
            }
            size++;
            counts.add(cnt);
        }
        Collections.sort(counts);
        return counts.get(counts.size()-1);
    }
}