class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        int sum=0;
        
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
            
            if(i==arr.length-1){
                double divisor=arr.length;
                answer=sum/divisor;    
            }
        }
        return answer;
    }
}