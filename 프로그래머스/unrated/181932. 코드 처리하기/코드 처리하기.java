class Solution {
    public String solution(String code) {
        String ret = "";
        int mode = 0;
        
        for(int i=0; i<code.length(); i++){
            int idx=i;
            String word = code.substring(idx,idx+1);
            
            if(!word.equals("1")){
                if(mode==0){
                    ret += (idx%2==0) ? word:"";
                }else{
                    ret += (idx%2==1) ? word:"";
                }
            }else{
                mode = (mode==0) ? 1:0;
            }
        }
        
        if(ret.length()==0){
            return "EMPTY";
                
        }else{
            return ret;   
        }    
    }
}