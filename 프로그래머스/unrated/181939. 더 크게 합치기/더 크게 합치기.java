class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String temp1=Integer.toString(a)+Integer.toString(b);
        String temp2=Integer.toString(b)+Integer.toString(a);
        
        if(Integer.parseInt(temp1)>Integer.parseInt(temp2)){
            answer=Integer.parseInt(temp1);    
        }else{
            answer=Integer.parseInt(temp2);
        }
        
    
        return answer;
    }
}