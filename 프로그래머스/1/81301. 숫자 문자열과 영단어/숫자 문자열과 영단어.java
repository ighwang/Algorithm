class Solution {
    public int solution(String s) {
        String[] arr = {"zero","one","two","three","four",
                          "five","six","seven","eight","nine"};
        
        int idx = 0;      
        for(String target : arr){
            s = s.replace(target,Integer.toString(idx++));
        }
        
        return Integer.parseInt(s);
    }
}