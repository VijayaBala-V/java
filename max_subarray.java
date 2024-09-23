package vijay;
import java.util.*;
public class max_subarray {
    public static int subarray(int[] arr,int n)
    {
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            max=Math.max(sum,max);
            if(sum<0)
            {
                sum=0;
            }
        }
        return max;
    }
    public static void main(String[] args)
    {
        Scanner vj=new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n=vj.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=vj.nextInt();
        }
        int maxvalue=subarray(arr,n);
        System.out.println("Maximum SubArray Value is: "+maxvalue);
        vj.close();
    }
}
