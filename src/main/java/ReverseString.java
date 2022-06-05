public class ReverseString {
    public static void main(String[] args) {
        String name="Lunga";

        String newString="";
        char ch;
        for(int i = 0;i<name.length(); i++){
            ch=name.charAt(i);
            newString=ch+newString;
        }
        System.out.println(newString);
    }
}
