class Solution {
    public int solution(int[] arr) {
        // 1. arr 배열 내의 최대값 추출
        int max = arr[0];
        
        for(int i=1; i<arr.length; i++){
            if(max<arr[i]){
                max = arr[i];   
            }
        }
        
        // 2. 최대값을 이용하여 최소공배수 찾기
        int answer = max;
        
        while(true){
            int cnt = 0;
            
            for(int i=0; i<arr.length; i++){
                if(answer%arr[i] == 0){
                    cnt++;
                }
            }
            
            if(cnt == arr.length){
                break;
            }else{
                answer += max;
            }
            
        }
        
        return answer;
    }
}