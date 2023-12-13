class Solution {
    public int solution(int n) {
        int answer = 0;
        String base = "";
        
        // 1. 10진법 숫자를 3진법으로 변환 후, 앞뒤 반전
        while(n!=0){
            base += Integer.valueOf(n%3);
            n /= 3;
        }
        
        // 2. 반전된 3진법 숫자를 10진법 숫자로 변환
        for(int i=base.length(); i>=1; i--){
            int number = Integer.parseInt(base.substring(i-1,i));
            answer += number*Math.pow(3,base.length()-i);
        }
        
        return answer;
    }
}