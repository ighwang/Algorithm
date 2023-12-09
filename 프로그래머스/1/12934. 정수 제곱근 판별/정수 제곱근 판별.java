class Solution {
    public long solution(long n) {
        long answer = -1;    
        long x = 1;
        
        while(x<=n){
            if(n%x==0 && n/x==x){
                answer = (long) Math.pow(x+1,2);
                break;
            }else{
                x++;
            }    
        }      
        
        return answer;
    }
}