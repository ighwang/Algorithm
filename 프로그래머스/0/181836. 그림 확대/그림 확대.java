class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length*k];
        
        for(int i=0; i<picture.length; i++){
            String temp = "";

            for(int j=0; j<picture[i].length(); j++){
                for(int l=1; l<=k; l++){
                    temp += picture[i].substring(j,j+1);
                }
            }
            for(int j=i*k; j<i*k+k; j++){
                answer[j] = temp;
            }
        }
        return answer;
    }
}