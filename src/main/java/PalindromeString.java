import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter String");
        String name=in.next();
        char c;
        String newName="";
        for(int i=0;i<name.length();i++){
           c=name.charAt(i);
           newName=c+newName;
        }
        System.out.println(newName);
        if(newName.equals(name)){
            System.out.println("Name is Palindrome");
        }else{
            System.out.println("Name is not Palindrome");
        }
    }
}
