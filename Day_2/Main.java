import java.util.Scanner;

class Main{
    public static void main(String[] args){

        //user input
        Scanner sc=new Scanner(System.in);

        //number of trials
        int no_of_trials=5;
        int i;
        
        //random number generation
        int random_num=(int)(Math.random()*100) + 1;
        
        System.out.println("welcome to Number guessing game...");
        
        
        for(i=0;i<no_of_trials;i++){
            
            System.out.print("Enter any number between 1 and 100: ");
            int input=sc.nextInt();
            
            if(input>100 || input<1){
                System.out.println("Invalid input.");
            }
            
            else if(input==random_num){
                System.out.println("You win!");
                break;
            }
            
            else if(input< random_num){
                System.out.println("Entered number is less than the actual number.");
                }
                
            else {
                System.out.println("Entered number is greater than the actual number.");
            }
            System.out.println("You have " +(no_of_trials-i-1) + " trials left.");

        }
        if(i==no_of_trials) {System.out.println("The correct number is "+ random_num);}
        
        }
}