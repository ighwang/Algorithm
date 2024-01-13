import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 1;
        int flag = 0;
        int[] dices = {a, b, c, d};
        Arrays.sort(dices);
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(dices[0]);

        for(int i=0; i<dices.length-1; i++){
            if(dices[i]==dices[i+1]){
                flag = dices[i+1];
            }else{
                arr.add(dices[i+1]);
            }
        }

        if(arr.size()==1){
            answer = 1111*arr.get(0);
        }else if(arr.size()==2){
            if(dices[0]==dices[1] && dices[1]!=dices[2]){
                answer = (arr.get(0)+arr.get(1))*(arr.get(1)-arr.get(0));
            }else{
                int notFlag = 0;
                for(int num : arr){
                    notFlag = (num!=flag) ? num:notFlag;
                }
                answer = (10*flag+notFlag)*(10*flag+notFlag);
            }
        }else if(arr.size()==3){
            for(int i=0; i<arr.size(); i++){
                answer = (arr.get(i)!=flag) ? answer*arr.get(i):answer;
            }
        }else{
            answer = arr.get(0);
        }
        return answer;
    }
}