import java.util.*;

class Solution {
    public ArrayList<Integer> solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i=0; i<intStrs.length; i++){
            int num = Integer.parseInt(intStrs[i].substring(s,s+l));
            
            if(num>k){
                answer.add(num);
            }
        }
        return answer;
    }
}