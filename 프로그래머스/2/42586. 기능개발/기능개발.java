import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answer = new ArrayList<>();
        int idx = 0;
        
        while(idx<progresses.length){
            int count = 0;
            
            for(int i=0; i<progresses.length; i++){
                progresses[i] = (progresses[i]<100) ? progresses[i]+speeds[i]:progresses[i];
            }
            for(int i=idx; i<progresses.length; i++){
                if(progresses[idx]>=100){
                    idx++;
                    count++;
                }else{
                    break;
                }
            }
            if(count>0){
                answer.add(count);
            }
        }
        return answer;
    }
}