package Test_Array;
import java.util.Scanner;
class TestArray
{
    public static void main(String[] args) 
    {
        int n, temp;
        Scanner s = new Scanner(System.in);
<<<<<<< HEAD
        System.out.print("Enter no. elements you want in array:");
=======
        System.out.print("Enter no. of elements:");
>>>>>>> b5bffa24be490825a0ec10fffccced97fd202f43
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) 
        {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Ascending Order:");
        for (int i = 0; i < n - 1; i++) 
        {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[n - 1]);
    }
}
