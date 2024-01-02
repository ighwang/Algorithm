import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {-1};
        int[] range = {-1,-1};
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]==2){
                if(range[0]==-1){
                    range[0] = i;
                }else{
                    range[1] = i;
                }   
            }
        }
        
        if(range[0]!=-1){
            answer = (range[1]!=-1) ? Arrays.copyOfRange(arr,range[0],range[1]+1):new int[]{2};    
        }
        
        return answer;
    }
}