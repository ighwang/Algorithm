class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");

        for(int i=0; i<arr.length; i++){
            if(i>0){
                arr[i] = (arr[i-1].equals(" ")) ? arr[i].toUpperCase() : arr[i].toLowerCase();
            }else{
                arr[i] = arr[i].toUpperCase();
            }
            answer += arr[i];
        }
        
        return answer;
    }
}