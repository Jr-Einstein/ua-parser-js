import java.util.Scanner;

public class casechecker {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Alphabet You Want to Test For Lower or Uppercase : ");
        char ch = input.next().trim().charAt(0);
        
        
        if( ch >= 'a' && ch <= 'z'){
            System.out.println("It is a Lowercase Value : "+ch );
        } else {
            System.out.println("It is a Uppercase Value : " + ch);
        }
    }
    
}
