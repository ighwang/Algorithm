class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        char[] code = new char[52];

        for(int i=0; i<code.length; i++){
            if(i<26){
                code[i] = (char) (i+65);
            }else{
                code[i] = (char) (i+71);
            }
        }

        for(int i=0; i<my_string.length(); i++){
            for(int j=0; j<code.length; j++){
                if(my_string.charAt(i)==code[j]){
                    answer[j]++;
                }
            }
        }
        
        return answer;
    }
}