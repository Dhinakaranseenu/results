import java.util.Scanner;

class Account{
     double balance ;
    private int depositAmount;
    private Object account1;
    public Account(double initialBalance){
        if(initialBalance > 0.0)
            balance = initialBalance;
            
        }

    public void deposit(double amount){
        
        double depositAmount;
        amount = depositAmount;
        balance = balance + amount;
    }
    public double getBalance(double amount){
        return balance ;
    }
    public void withdraw(double amount){
        balance = balance - amount;
    }
    {
     if(depositAmount > ((Object) account1).getBalance()){ 
      System.out.println("You don't hava enouh money for this transaction,the amount available is: $%.2f\n");  
            
     }
     else{
         ((Account) account1).deposit(depositAmount);
        System.out.println("The new balance is : $%.2f\n", account1.getBalance());
     }
    }
} 
class UserAccount{
    public static void main(String[] args) {               
        Account account1 = new Account(50.0);

        
	System.out.printf(" account1 balance: $%.2f\n", account1.getBalance(0) );

    Scanner input = new Scanner( System.in );
	double depositAmount; 

	System.out.print( "Enter deposit amount for account1: "); 
	depositAmount = input.nextDouble(); 
	System.out.printf( "\nadding %.2f to account1 balance\n\n", depositAmount );
	account1.deposit( depositAmount );
    System.out.printf( "account1 balance: %$.2f\n", account1.getBalance(0));

    Scanner in = new Scanner(System.in );
	

	System.out.print( "Enter debit amount for account1: "); 
	depositAmount = in.nextDouble(); 
	System.out.printf( "\nsubtracting %.2f from account1 balance\n\n", depositAmount );
	account1.withdraw( depositAmount ); 

	
	System.out.printf( "account1 balance: %$.2f\n", account1getBalance() );


    }

    private static Object account1getBalance() {
        return null;
    }
}