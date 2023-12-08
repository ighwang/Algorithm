class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String temp=Integer.toString(x);
        int divisor=0;
        
        for(int i=0; i<temp.length(); i++){
            divisor+=Integer.parseInt(temp.substring(i,i+1));    
        }
        
        if(x%divisor!=0){
            answer=false;
        }
        
        return answer;
    }
}