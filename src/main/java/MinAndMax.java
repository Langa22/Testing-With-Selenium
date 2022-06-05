import java.util.Arrays;

public class MinAndMax {
    public static void main(String[] args) {
        int [] arr={45,7,8,98,23,45,67,87};
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum number is : "+max);
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Minimum number is : "+min);
    }
}
