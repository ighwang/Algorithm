class Solution {
    public long solution(int price, long money, int count) {
        long answer = -1;
        
        for(int i=1; i<=count; i++){
            money=money-i*price;
        }
        
        answer = (money<0) ? answer*money : 0;

        return answer;
    }
}