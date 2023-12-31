class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        boolean[] first_cal = new boolean[2];
        
        first_cal[0] = (x1 || x2) ? true:false;
        first_cal[1] = (x3 || x4) ? true:false;
        answer = (!first_cal[0] || !first_cal[1]) ? false:true;
        
        return answer;
    }
}