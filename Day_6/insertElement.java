package Day_6;
import java.util.Scanner;
import java.util.Arrays;

public class insertElement {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int value=0;
       int[] arr=new int[5];
       int[] arr1=new int[arr.length+1];
       for(int i=0;i<arr.length;i++){
           arr[i] =sc.nextInt();
       }
       int i;
       for(i=0;i<2;i++){
           arr1[i]=arr[i];
       }
       arr1[i]=value;
       for(i=2;i<arr.length;i++){
           arr1[i+1]=arr[i];
       }
       
       System.out.print(Arrays.toString(arr1));
       
    }

    
}
