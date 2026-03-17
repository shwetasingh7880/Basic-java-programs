import java.util.Scanner;

class StudentRoll
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of student :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter students roll number:");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Print students roll number:");
         for(int i=0; i<n; i++)
        {
            System.out.print(arr[i] +" ");
        }       
    } 
}