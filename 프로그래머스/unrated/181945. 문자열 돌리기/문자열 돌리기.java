import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        
        String line="";
        char letter;
        
        for(int i=0; i<input.length(); i++){
            letter=input.charAt(i);
            line+=letter+"\n";
        }
        
        System.out.println(line);
    }
}