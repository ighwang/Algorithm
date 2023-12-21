class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        // 1. 분수 덧셈
        int gcd = 1;
        int min = (denom1<denom2) ? denom1:denom2;

        for(int i=1; i<=min; i++){
            if(denom1%i==0 && denom2%i==0){
                gcd = i;
            }
        }

        denom1 /= gcd;
        denom2 /= gcd;

        answer[1] = gcd*denom1*denom2;
        answer[0] = denom1*numer2+denom2*numer1;

        // 2. 분수 약분
        gcd = 1;
        min = (answer[0]<answer[1]) ? answer[0]:answer[1];
        for(int i=1; i<=min; i++){
            if(answer[0]%i==0 && answer[1]%i==0){
                gcd = i;
            }
        }

        answer[0] /= gcd;
        answer[1] /= gcd;
        
        return answer;
    }
}