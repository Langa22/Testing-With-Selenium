import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter first string");
        String String1=in.next();
        System.out.println("Enter second string");
        String String2=in.next();
        char[]chars=String1.toCharArray();
        char[]chars1=String2.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(chars1);
        String1=new String(chars);
        String2=new String(chars1);
        if(String1.equals(String2)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not anagram");
        }
    }
}
