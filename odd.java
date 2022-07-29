import java.util.Scanner;
public class odd {
    
public static void main(String args[]){
Scanner in = new Scanner(System.in);
int x ;
System.out.println("Enter any integer to check:");
x = in.nextInt();

if(x % 2 == 0){
System.out.println("The input number is even");
}
else{
    System.out.println("The input number is odd");
}
}
}