import java.util.Scanner;

public class possitive{
    
    public static void main(String args[]){

        int num;
        Scanner ja = new Scanner(System.in);
        System.out.println("Enter the Any Numbers:");
        num = ja.nextInt();

        if(num > 0){
            System.out.println("This is possitive number");
        }
        else if(num < 0){
            System.out.println("This is Negative Number");
        }
        else{
            System.out.println("It is Zero");
        }

    }
}