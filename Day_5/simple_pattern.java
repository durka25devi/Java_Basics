package Day_5;

import java.util.Scanner;

public class simple_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // simple pattern printing
        
        int n=sc.nextInt();
     for(int i=0;i<n;i++){
         for(int j=0;j<n;j++){
             System.out.print("-");
             if(j<n-1){
                 System.out.print(" ");
             }
         }
         System.out.println();
     } 
    
}
}