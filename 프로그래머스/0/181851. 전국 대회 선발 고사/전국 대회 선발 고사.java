class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int[] top3 = new int[3];
        int count = 0;

        while(count<3){
            int temp = rank.length+1;
            int idx = -1;

            for(int i=0; i<rank.length; i++){
                if(attendance[i] && rank[i]<temp){
                    temp = rank[i];
                    idx = i;
                }
            }
            attendance[idx] = false;
            top3[count++] = idx;
        }
        return (10000*top3[0]+100*top3[1]+1*top3[2]);
    }
}