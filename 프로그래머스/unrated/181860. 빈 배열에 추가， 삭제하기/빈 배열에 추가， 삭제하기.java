import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i=0; i<flag.length; i++){
            if(flag[i]){
                for(int j=0; j<2*arr[i]; j++){
                    answer.add(arr[i]);
                }
            }else{
                int range = answer.size();
                
                for(int j=range-1; j>=range-arr[i]; j--){
                    answer.remove(j);
                }
            }
        }
        return answer;
    }
}