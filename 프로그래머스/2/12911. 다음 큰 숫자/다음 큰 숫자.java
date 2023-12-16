class Solution {
    public int solution(int n) {
        int answer = n+1;
        
        while(true){
            int[] numbers = {n,answer};
            int[] count = new int[2];
            
            while(numbers[1]!=0){
                if(numbers[0]%2==1){
                    count[0]++;
                }
                    
                if(numbers[1]%2==1){
                    count[1]++;
                }
        
                numbers[0] /= 2;
                numbers[1] /= 2; 
            }
            
            if(count[0]==count[1]){
                break;
            }else{
                answer++;
            }
        }
        
        return answer;
    }
}