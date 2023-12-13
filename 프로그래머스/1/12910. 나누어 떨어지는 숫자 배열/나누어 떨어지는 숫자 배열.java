import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int[] arr, int divisor) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        
        // 1. arr 배열 오름차순으로 정렬하기(선택정렬)
        for(int i=0; i<arr.length-1; i++){
            int flag = arr[i];
            int idx = -1;
            
            for(int j=i+1; j<arr.length; j++){
                if(flag>arr[j]){
                    flag = arr[j];
                    idx = j;
                } 
            }
            
            if(idx!=-1){
                arr[idx] = arr[i];
                arr[i] = flag;
            }
        }
        
        // 2. divisor로 나누어 떨어지는 값 추출(값이 없으면 -1 반환)
        int count = 0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor==0){
                answer.add(arr[i]);
                count++;
            }    
        }
        
        if(count==0){
            answer.add(-1);
        }
        
        return answer;
    }
}