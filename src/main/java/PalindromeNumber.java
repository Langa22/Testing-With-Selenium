import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number");
        int number=s.nextInt();
        int remainder=0,reverse=0;
        while(number!=0){
            remainder=number%10;
            reverse=remainder*10+remainder;
            number=number/10;
        }
        if(number==reverse){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not palindrome");
        }
    }
}
