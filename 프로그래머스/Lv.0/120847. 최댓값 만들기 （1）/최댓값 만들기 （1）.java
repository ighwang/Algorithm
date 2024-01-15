class Solution {
    public int solution(int[] numbers) {
        final int MAX_IDX = numbers.length-1;
        for(int i=0; i<numbers.length; i++){
            int idx = i;
            
            for(int j=idx; j<numbers.length; j++){
                if(numbers[idx]>numbers[j]){
                    idx = j;
                }
            }
            int temp = numbers[i];
            numbers[i] = numbers[idx];
            numbers[idx] = temp;
        }
        return numbers[MAX_IDX-1]*numbers[MAX_IDX];
    }
}