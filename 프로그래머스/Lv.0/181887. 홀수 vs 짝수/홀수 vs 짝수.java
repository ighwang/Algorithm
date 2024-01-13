class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int[] sum = new int[2];
        
        for(int i=0; i<num_list.length; i++){    
            if(i%2==0){
                sum[0] += num_list[i];
            }else{
                sum[1] += num_list[i];
            }
        }
        answer = (sum[0]>sum[1]) ? sum[0]:sum[1];
        return answer;
    }
}