import java.math.*;

class Solution {
    public long solution(int n) {
        long answer = 0; 
        
        BigInteger quot = new BigInteger("1234567");
        BigInteger prev = new BigInteger("1");   // F(1)
        BigInteger post = new BigInteger("1");   // F(2)
        
        for(int i=3; i<=n; i++){    // F(3)부터 값을 구한다.
            BigInteger temp = post;
            post = post.add(prev);
            prev = temp;
        }
        answer = (post.remainder(quot)).longValue();
        return answer;
    }
}