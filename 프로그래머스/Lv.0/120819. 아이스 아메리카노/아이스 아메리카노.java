class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        final int PRICE = 5500;
        
        while(money>=PRICE){
            money -= PRICE;
            answer[0]++;
        }
        answer[1] = money;
        return answer;
    }
}