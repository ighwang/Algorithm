class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] copy = new int[arr.length];
        
        while(true){
            answer++;

            // 1. 수열 변환
            for(int i=0; i<arr.length; i++){
                copy[i] = arr[i];

                if(arr[i]%2==1 && arr[i]<50){
                    arr[i] = arr[i]*2+1;
                }else if(arr[i]%2==0 && arr[i]>=50){
                    arr[i] /= 2;
                }
            }

            // 2. 수열 비교
            int cnt = 0;

            for(int i=0; i<arr.length; i++){
                if(arr[i]==copy[i]){
                    cnt++;
                }
            }

            if(cnt==arr.length){
                break;
            }
        }
        
        return answer-1;
    }
}