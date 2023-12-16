class Solution {
    public String solution(String s) {
        String answer = ""; 
        String[] temp = s.split(" ");  
        int[] numbers = new int[temp.length];
        
        for(int i=0; i<temp.length; i++){
            numbers[i] = Integer.parseInt(temp[i]);    
        }
        
        int[] minMax = {numbers[0], numbers[0]};
        
        for(int i=1; i<numbers.length; i++){
            // 최소값 추출
            if(minMax[0]>numbers[i]){
                minMax[0] = numbers[i];     
            }
            
            // 최대값 추출
            if(minMax[1]<numbers[i]){
                minMax[1] = numbers[i]; 
            }
        }
        
        answer += minMax[0]+" "+minMax[1];    
        return answer;
    }
}