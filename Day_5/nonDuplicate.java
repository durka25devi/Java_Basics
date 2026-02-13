package Day_5;

public class nonDuplicate {
    public static void main(String[] args) {
       String[] arr={"How","hello", "hello", "how", "are","hello"};
      int i,j;
      int[] int_arr=new int[arr.length];
      
      for(i=0;i<arr.length;i++){
          int count=0;
          for(j=i+1;j<arr.length;j++){
              if(arr[i].equalsIgnoreCase(arr[j]) && int_arr[i]!=1 && int_arr[j]!=1) {
              
                  int_arr[j]=1;
                  count=1;
                   }
               }
          if(count==1){
              int_arr[i]=1;
          }
      }
      for(i=0;i<arr.length;i++){
          if(int_arr[i]!=1){
              System.out.println(arr[i]);
          }
      }
       }
    }
    

