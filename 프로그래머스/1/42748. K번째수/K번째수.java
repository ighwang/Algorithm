class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int cnt = 0;
        
        while(cnt<commands.length){
            // 1. i~j 범위의 숫자를 추출
            int[] numbers = new int[commands[cnt][1]-commands[cnt][0]+1];
            int idx = 0;
            
            for(int i=commands[cnt][0]-1; i<commands[cnt][1]; i++){
                numbers[idx++] = array[i];
            }
            
            // 2. 추출한 숫자들 정렬
            for(int i=0; i<numbers.length; i++){
                for(int j=0; j<numbers.length-1; j++){
                    if(numbers[j]>numbers[j+1]){
                        int temp = numbers[j];
                        numbers[j] = numbers[j+1];
                        numbers[j+1] = temp;
                    }
                }
            }
            
            // 3. 추출한 숫자들 중, k번째 숫자를 추출
            answer[cnt] = numbers[commands[cnt++][2]-1];
        }
        
        
        return answer;
    }
}