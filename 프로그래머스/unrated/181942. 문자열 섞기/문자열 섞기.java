class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        
        for(int i=0; i<str1.length(); i++){
            char letter1=str1.charAt(i);
            char letter2=str2.charAt(i);
            
            answer+=String.valueOf(letter1)+String.valueOf(letter2);
        }
        
        return answer;
    }
}