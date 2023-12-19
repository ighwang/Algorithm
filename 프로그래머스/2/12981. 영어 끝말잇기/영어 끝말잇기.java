class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {2,1};
        
        for(int i=1; i<words.length; i++){
            // 1. 한 라운드가 끝날 경우, 순번 초기화 및 라운드 증가
            if(answer[0]>n){
                answer[0]=1;
                answer[1]++;
            }

            // 2. 끝말을 잇는지 여부 판단
            if(words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)){
                break;
            }

            // 3. 이전에 언급된 단어가 있는지 존재여부 판단
            boolean dupl = false;
            
            for(int j=i-1; j>=0; j--){
                if(words[i].equals(words[j])){
                    dupl = true;
                    break;
                }
            }

            // 4. 게임오버 조건
            if(dupl){
                break;
            }else{
                answer[0]++;
            }

            if(i==words.length-1){
                answer=new int[2];
            }
        }

        return answer;
    }
}