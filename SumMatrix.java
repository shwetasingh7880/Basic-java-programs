import java.util.Scanner;

class SumMatrix
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows :");
        int n1 = sc.nextInt();

        System.out.print("Enter number of column :");
        int n2 = sc.nextInt();
        int arr1[][] = new int[n1][n2];
        int arr2[][] = new int[n1][n2];
        int arr3[][] = new int[n1][n2];

        System.out.println("Enter 1st matrix elements :");
        for(int i=0; i<n1; i++)
        {
            for(int j=0; j<n2; j++)
            {
                 arr1[i][j]  = sc.nextInt();
            }
        }

        System.out.println("Enter 2nd matrix elements :");
        for(int i=0; i<n1; i++)
        {
            for(int j=0; j<n2; j++)
            {
                 arr2[i][j]  = sc.nextInt();
            }
        }

        for(int i=0; i<n1; i++)
        {
            for(int j=0; j<n2; j++)
            {
                 arr3[i][j]  = arr1[i][j]+arr2[i][j];
            }
        }

        System.out.println("Addition of two matrices :");
        for(int i=0; i<n1; i++)
        {
            for(int j=0; j<n2; j++)
            {
                 System.out.print(arr3[i][j]+"  ");
            }
            System.out.println("\n");
        }
    }
}