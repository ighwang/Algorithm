import java.util.Stack;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> stk = new Stack<>();
        
        for(int num : ingredient){
            stk.push(num);
            if(stk.size()>=4){
                int cnt = 0;
                int[] burger = {1,3,2,1};
                
                for(int j=0; j<burger.length; j++){
                    if(burger[j]==stk.get(stk.size()-1-j)){
                        cnt++;
                    }
                }
                if(cnt==4){
                    for(int j=0; j<burger.length; j++){
                        stk.pop();
                    }
                    answer++;
                }
            }
        }
        return answer;
    }
}