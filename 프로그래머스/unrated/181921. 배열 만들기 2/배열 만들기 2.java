import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int l, int r) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i=l; i<=r; i++){
            int cnt = 0;
            String num = Integer.toString(i);
            
            for(int j=0; j<num.length(); j++){
                if(num.substring(j,j+1).equals("0") || num.substring(j,j+1).equals("5")){
                    cnt++;
                }
            }
        
            if(cnt==num.length()){
                answer.add(Integer.parseInt(num));
            }    
        }
        
        if(answer.isEmpty()){
            answer.add(-1);
        }
        
        return answer;
    }
}