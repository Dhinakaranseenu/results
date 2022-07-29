
import java.util.Scanner;

public class largest {
    
    public static void main(String args[]){
        
        int x, y, z ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number:");
        x = sc.nextInt();
        System.out.println("Enter the second Number:");
        y = sc.nextInt();
        System.out.println("Enter the Third Number:");
        z = sc.nextInt();

        if(x > y && x < z){
            System.out.println("The Largest Number is:" +x);
        }
        else if(y > z ){
            System.out.println("The Largest Number is:" +y);
        }
        else{
            System.out.println("The Largest Number is:" +z);
        }
    }
}