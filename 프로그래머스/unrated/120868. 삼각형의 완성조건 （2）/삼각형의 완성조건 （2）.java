class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = 0;
        
        max = (sides[0]>sides[1]) ? sides[0] : sides[1];
        
        for(int i=Math.abs(sides[0]-sides[1])+1; i<=max; i++){
            answer++;
        }
        
        for(int i=max+1; i<sides[0]+sides[1]; i++){
            answer++;
        }
        
        
        return answer;
    }
}