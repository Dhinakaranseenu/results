import java.util.Scanner;

public class small {
    
    public static void main(String args[]){
        int a ;
        int b ;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Two numbers");
        a = s.nextInt();
        b = s.nextInt();
        
        System.out.println(" The smallest value is " + Math.min(a,b));

    }
}