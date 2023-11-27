import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        String b="";
        char letter;
        
        for(int i=0; i<a.length(); i++){
            letter=a.charAt(i);
            
            if((letter>=65) && (letter<=90)){
                b+=a.valueOf(letter).toLowerCase();
            }else if((letter>=97) && letter<=122){
                b+=a.valueOf(letter).toUpperCase();
            }
        }
        
        System.out.println(b);
        
    }
}