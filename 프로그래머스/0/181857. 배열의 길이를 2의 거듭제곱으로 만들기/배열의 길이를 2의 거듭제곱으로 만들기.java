import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int num : arr){
            answer.add(num);
        }
        for(double i=0; i<10; i++){
            if(answer.size()==Math.pow(2,i)){
                break;
            }
            if(answer.size()>(int) Math.pow(2,i) && answer.size()<(int) Math.pow(2,i+1)){
                final int SIZE = answer.size();

                for(int j=1; j<=Math.pow(2,i+1)-SIZE; j++){
                    answer.add(0);
                }
                break;
            }
        }
        return answer;
    }
}