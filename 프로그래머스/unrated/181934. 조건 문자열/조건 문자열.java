class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        
        if(ineq.equals("<")){
            if(eq.equals("=")){
                answer = (m-n>=0) ? 1:0;
            }else{
                answer = (m-n>0) ? 1:0;
            }
        }else{
            if(eq.equals("=")){
                answer = (n-m>=0) ? 1:0;
            }else{
                answer = (n-m>0) ? 1:0;
            }
        }
        
        return answer;
    }
}