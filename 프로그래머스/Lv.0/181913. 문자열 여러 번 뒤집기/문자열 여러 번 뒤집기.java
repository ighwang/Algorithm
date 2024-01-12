class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = my_string;
        
        for(int i=0; i<queries.length; i++){
            String word = answer.substring(queries[i][0],queries[i][1]+1);
            String temp = "";

            for(int j=0; j<queries[i][0]; j++){
                temp += answer.substring(j,j+1);
            }
            for(int j=word.length(); j>=1; j--){
                temp += word.substring(j-1,j);
            }
            for(int j=queries[i][1]+1; j<answer.length(); j++){
                temp += answer.substring(j,j+1);
            }
            answer = temp;
        }
        return answer;
    }
}