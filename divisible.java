import java.util.Scanner;

public class divisible {
    
    public static void main(String args[]){
        
        int num;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Any Number to check it is Divisible by 4 and 5 :");
        num = s.nextInt();

        if(num % 4 == 0 && num % 5 == 0){
            System.out.println(" Given number "+ num + " is Divisible by 4 and 5");
        }
        else{
            System.out.println(" Given number "+ num + " is Not Divisible by 4 and 5");
        }
    }
}