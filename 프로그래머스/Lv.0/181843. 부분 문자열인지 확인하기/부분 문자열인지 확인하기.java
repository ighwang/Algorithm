class Solution {
    public int solution(String my_string, String target) {
        int answer = 0;
        
        if(my_string.length()>=target.length()){
            for(int i=0; i<=my_string.length()-target.length(); i++){
                if(my_string.substring(i,i+target.length()).equals(target)){
                    answer = 1;
                    break;
                }
            }
        }
        return answer;
    }
}