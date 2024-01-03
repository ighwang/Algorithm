class Solution {
    public int[] solution(int n) {
        int[] answer = {n};
        int[] temp = answer;
        int size = answer.length+1;
        
        while(n!=1){
            n = (n%2==0) ? n/2:n*3+1;
            answer = new int[size];
            answer[size++-1] = n;
           
            for(int i=0; i<temp.length; i++){
                answer[i] = temp[i];
            }
         
            temp = answer;
        }
        return answer;
    }
}