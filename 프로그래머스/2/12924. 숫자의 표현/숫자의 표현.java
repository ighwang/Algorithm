class Solution {
    public int solution(int n) {
        int answer = 1;
        
        // 1. 연속된 숫자의 최대갯수 찾기
        int sum = 0;
        int cnt = 0;

        for(int i=1; i<n; i++){
            if(sum>n && sum<n+i){
                cnt--;
                break;
            }else{
                sum += i;
                cnt++;
            }
        }
        // 2. 연속된 자연수들로 n을 표현하는 방법의 수 구하기
        int num = 1;

        while(cnt>1){
            sum = 0;

            for(int i=num; i<num+cnt; i++){
                sum += i;
            }

            if(sum==n){
                answer += 1;
                num = 1;
            }else if(sum>n){
                num = 1;
            }else{
                num++;
                continue;
            }
            cnt--;
        }
        return answer;
    }
}