class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long flag=Long.parseLong(p);
        
        for(int i=0; i<=t.length()-p.length(); i++){
            long num=Long.parseLong(t.substring(i,i+p.length()));
            
            if(num<=flag){
                answer++;
            }
        }
        
        return answer;
    }
}