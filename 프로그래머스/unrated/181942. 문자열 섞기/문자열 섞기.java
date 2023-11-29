class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        
        char letter1;
        char letter2;
        
        for(int i=0; i<str1.length(); i++){
            letter1=str1.charAt(i);
            letter2=str2.charAt(i);
            
            answer+=String.valueOf(letter1)+String.valueOf(letter2);
        }
        
        return answer;
    }
}