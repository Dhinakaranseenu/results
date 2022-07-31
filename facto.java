import java.util.Scanner;

class  facto{

    public static void main(String args[]){
        
        Scanner sc =  new Scanner(System.in);
         int d ;
         int c = 1 ;
        d = sc.nextInt();
         
        for(int b=1 ; b<=d ; b++){

            c = c*b ;
            System.out.println(c);


        }
        

        }
    }
