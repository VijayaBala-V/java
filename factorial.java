package vijay;
import java.util.*;

public class factorial {
    public static int fact(int[] arr,int n)
    {
        int f=1;
        while(n>0)
        {
            f*=(n);
            n-=1;
        }
        return f;
    }
    public static void main(String[] args)
    {
        Scanner vj=new Scanner(System.in);
        System.out.print("Enter the no :");
        int n=vj.nextInt();
        int[] arr=new int[n];
        int z=arr.length;
        int f=fact(arr,z);
        System.out.println("Factorial of the number is :"+f);


    }
}
