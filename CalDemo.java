
  import java.lang.*;
  import java.util.Scanner;
  
public class CalDemo{
public static void main (String[] args){
   // Creating object of Calc class  
   Calc obj= new Calc();

     obj.add(3, 3);
     obj.add(10, 10);
  
double area = 3* Calc.PI;
System.out.println("Area:"+ area);
  
System.out.println(Math.pow(5,9));
System.out.println(Math.min(5,9));
System.out.println(Math.max(5,9));
System.out.println(Math.ceil(5.9));

     // Calling static method from Util class 
  System.out.println(Util.max(10 ,15));
  System.out.println(Util.max(11 , 16.0));
  System.out.println(Util.max(4 , 5.0));
  System.out.println(Util.max('a','b'));
  
    Scanner sc = new Scanner(System.in);
    }
}