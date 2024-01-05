class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];   
        int cnt = 1;
        int y = 0;
        int x = 0;

        while(cnt<=answer.length*answer[0].length){
            for(int i=0; i<arr2.length; i++){
                answer[y][x] += arr1[y][i]*arr2[i][x];
            }

            if(x<answer[0].length-1){
                x++;
            }else{
                y++;
                x = 0;
            }
            cnt++;
        }    
        return answer;
    }
}