class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        
        for(int i=1; i<numLog.length; i++){
            int flag=numLog[i]-numLog[i-1];
                
            if(flag==1){
                answer+="w";
            }else if(flag==-1){
                answer+="s";
            }else if(flag==10){
                answer+="d";
            }else{
                answer+="a";
            }
        }
        
        return answer;
    }
}