class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        String tempOdd="";
        String tempEven="";

        for(int i=0; i<num_list.length; i++){
            if(num_list[i]%2==1){
                tempOdd+=Integer.toString(num_list[i]);
            }else{
                tempEven+=Integer.toString(num_list[i]);
            }
        }
        
        answer=Integer.parseInt(tempOdd)+Integer.parseInt(tempEven);
        
        return answer;
    }
}