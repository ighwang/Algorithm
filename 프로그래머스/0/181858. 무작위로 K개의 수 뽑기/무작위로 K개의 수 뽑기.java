import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] arr, int k) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        int idx = 1;

        while(answer.size()<k){
            boolean isCheck = true;

            if(idx<arr.length){
                for(int i=0; i<answer.size(); i++){
                    if(arr[idx]==answer.get(i)){
                        isCheck = false;
                        break;
                    }
                }
                if(isCheck){
                    answer.add(arr[idx]);
                }
                idx++;
            }else{
                for (int i = answer.size() + 1; i <= k; i++) {
                    answer.add(-1);
                }
            }
        }   
        return answer;
    }
}