class Solution {
    public int[] solution(long n) {
        String temp=Long.toString(n);
        final int IDX=temp.length();
        int[] answer = new int[IDX];
        
        for(int i=0; i<IDX; i++){
            answer[i]=Integer.parseInt(temp.substring(IDX-i-1,IDX-i));
        }
        
        return answer;
    }
}