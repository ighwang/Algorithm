class Solution {
    public String solution(String phone_number) {
        String answer = "";
        final int FLAG=phone_number.length();
        
       
        for(int i=0; i<FLAG-4; i++){
            answer+="*";
        }
        
        return answer+phone_number.substring(FLAG-4, FLAG);
    }
}