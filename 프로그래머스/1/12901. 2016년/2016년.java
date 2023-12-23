import java.time.*;

class Solution {
    public String solution(int a, int b) {
        String answer = "";
        
        LocalDate localDate = LocalDate.of(2016, a, b);
        DayOfWeek day = localDate.getDayOfWeek();
        answer = (day.name()).substring(0,3);
        
        return answer;
    }
}