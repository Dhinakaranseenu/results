class  array{

    public static void main(String args[]){
      
        int a=1;
       int[] myarray = {11,25,43,91,66};
       System.out.println(myarray.length);
       System.out.println(myarray[0]);
       System.out.println(myarray[1]);
       System.out.println(myarray[2]);
       System.out.println(myarray[3]);
       System.out.println(myarray[4]);

        // shortcut 
        for(int m : myarray){
            System.out.println(m);
           }

       for(int i = 0 ; i < myarray.length ; i++){
          
        System.out.println(myarray[i]);
       }
       

       for(int i=0 ;i < myarray.length ; i++){
       System.out.println("The  eliment " + myarray[i]);
       a++; 
       }
    }
}