class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        
        for(String word1 : s1){
            for(String word2 : s2){
                answer += (word1.equals(word2)) ? 1:0;
            }
        } 
        return answer;
    }
}