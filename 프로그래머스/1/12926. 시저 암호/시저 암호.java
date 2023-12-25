class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] arr = s.toCharArray();
        
        for(char word : arr){
            int code = (int) word; 
            
            if(code>=65 && code<=90){
                code = (code+n>90) ? code+n-26:code+n; 
            }else if(code>=97 && code<=122){
                code = (code+n>122) ? code+n-26:code+n;
            }
            
            answer += (char) code;
        }
        
        return answer;
    }
}