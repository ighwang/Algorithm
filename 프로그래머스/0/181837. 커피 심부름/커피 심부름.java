class Solution {
    public int solution(String[] order) {
        int answer = 0;
        
        for(int i=0; i<order.length; i++){
            if(order[i].length()>=9){
                for(int j=0; j<order[i].length(); j++){
                    if(order[i].substring(j,j+9).equals("americano")){
                        answer += 4500;
                        break;
                    }
                    if(order[i].substring(j,j+9).equals("cafelatte")){
                        answer += 5000;
                        break;
                    }
                }

            }else{
                answer += 4500;
            }
        }
        return answer;
    }
}