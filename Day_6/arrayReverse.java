package Day_6;
import java.util.Scanner;
import java.util.Arrays;

public class arrayReverse {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
       int[] arr=new int[5];
      int i=0,j=arr.length-1;
      for(i=0;i<5;i++){
          arr[i]= sc.nextInt();
      }
      i=0;
      while(i<j){
          int temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
          i++;
          j--;
      }
      System.out.print(Arrays.toString(arr));
       
    }
}
    
