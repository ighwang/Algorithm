class Solution {
    public int solution(int order) {
        int answer = 0;
        
        String temp=Integer.toString(order);
        
        for(int i=0; i<temp.length(); i++){
            char letter=temp.charAt(i);
            int idx=Character.getNumericValue(letter);
            
            if(idx==3 || idx==6 || idx==9){
                answer++;
            }
        }
        return answer;
    }
}