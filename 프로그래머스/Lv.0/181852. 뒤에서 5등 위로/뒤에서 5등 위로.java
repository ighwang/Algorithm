class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length-5];

        for(int i=0; i<num_list.length-1; i++){
            int idx = i;

            for(int j=i+1; j<num_list.length; j++){
                if(num_list[idx]>num_list[j]){
                    idx = j;
                }
            }
            int temp = num_list[i];
            num_list[i] = num_list[idx];
            num_list[idx] = temp;
        }
  
        for(int i=5; i<num_list.length; i++){
            answer[i-5] = num_list[i];
        }
        return answer;
    }
}