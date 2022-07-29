import java.util.Scanner;

class marks {
    public static void main(String args[]){
Scanner s = new Scanner (System.in);
System.out.println("Enter the marks five subjects::\n");
float sub1 = s.nextFloat();
float sub2 = s.nextFloat();
float sub3 = s.nextFloat();
float sub4 = s.nextFloat();
float sub5 = s.nextFloat();

float total;
float average;
float percentage;
String grade;

total = sub1 + sub2 + sub3 + sub4 + sub5;
average = (float)(total / 5.0);
percentage = (float)((total / 500.0) * 100); 

if(average < 100 && average >= 80){
    grade = "A+" ;
}
else if (average < 79 && average >= 70){
    grade = "A" ;
}
else if(average < 69 && average >= 60){
    grade = "B" ;
}
else if(average < 59 && average >= 50){
    grade = "C" ;
}
else if(average < 49 && average >= 40){
    grade = "D" ;
}
else{
    grade = "Failed" ;
}
System.out.println("The Total Marks  = " + total + "/500.0");
System.out.println("The average Marks = " + average);
System.out.println("The Percentage = " + percentage + "%");
System.out.println("The Grade =" + grade);
    }
}