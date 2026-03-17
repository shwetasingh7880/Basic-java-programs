import java.util.Scanner;

class IfElse
{
  public static void main(String[] args)
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number :");
       int a=sc.nextInt(); 
       if(a>0)
         {
           System.out.println("Positive number");
         }
        if(a<0)
         {
           System.out.println("Negative number");
         }
         else
         {
           System.out.println("Neither negative nor positive");
         }     
   }
}