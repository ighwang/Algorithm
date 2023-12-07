class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        if(arr.length>1){
            answer=new int[arr.length-1];
            int min=arr[0];
            int cnt=0;
            
            for(int i=1; i<arr.length; i++){
                if(min>arr[i]){
                  min=arr[i];  
                }
            }
            
            for(int i=0; i<arr.length; i++){
                if(arr[i]!=min){
                    answer[cnt++]=arr[i];
                }
            }
        }else{
            answer=new int[1];
            answer[0]=-1;
        }
        
        return answer;
    }
}