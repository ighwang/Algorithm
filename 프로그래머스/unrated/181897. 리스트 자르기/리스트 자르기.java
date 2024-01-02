import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        
        if(n==1){
            answer = Arrays.copyOfRange(num_list,0,slicer[1]+1);    
        }else if(n==2){
            answer = Arrays.copyOfRange(num_list,slicer[0],num_list.length);
        }else if(n==3){
            answer = Arrays.copyOfRange(num_list,slicer[0],slicer[1]+1);
        }else{
            int size = 1;
            int[] temp = {};

            for(int i=slicer[0]; i<=slicer[1]; i+=slicer[2]){
                answer = new int[size];

                if(size>1){
                    for (int j = 0; j < temp.length; j++) {
                        answer[j] = temp[j];
                    }
                }
                answer[size-1] = num_list[i];
                temp = answer;
                size++;
            }
        }    
        return answer;
    }
}