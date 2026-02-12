package Day_5;
import java.util.Arrays;

public class arrayElementInsert {
    public static void main(String[] args) {
        
    // insert element at specific position
    int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
    int[] new_arr=Arrays.copyOf(my_array,my_array.length+1);
    int i;
    for(i= my_array.length - 1;i>2;i--){
        new_arr[i+1]=new_arr[i];
        
    }
    new_arr[i]=0;
    System.out.println(Arrays.toString(new_arr));
    }
}
    

