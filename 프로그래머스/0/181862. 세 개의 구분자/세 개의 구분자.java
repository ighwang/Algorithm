import java.util.*;

class Solution {
    public ArrayList<String> solution(String myStr) {
        ArrayList<String> answer = new ArrayList<>();
        String temp = "";

        for(int i=0; i<myStr.length(); i++){
            if(myStr.substring(i,i+1).equals("a") || myStr.substring(i,i+1).equals("b") || myStr.substring(i,i+1).equals("c")){
                if (!temp.equals("")) {
                    answer.add(temp);
                }
                temp = "";
            }else{
                temp += myStr.substring(i,i+1);
                
                if(i==myStr.length()-1){
                    answer.add(temp);
                }
            }
        }
        for(int i=0; i<answer.size(); i++){
            if(answer.get(i).equals("")){
                answer.remove(i);
            }
        }
        if(answer.size()==0){
            answer.add("EMPTY");
        }
        return answer;
    }
}