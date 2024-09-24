package vijay;

import java.util.*;
public class substring {
    public static int subarray(int n1,int n2,int[] arr)
    {
        int count=0;
        int i=0,j=n1-1;
        while(i<=j)
        {
            if(arr[i]+arr[j]<=n2)
            {
                count+=(j-i+1);
                i++;
            }
            else {
                j--;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner vj=new Scanner (System.in);
        System.out.println("Enter Size of An array:");
        int n1=vj.nextInt();
        System.out.println("Enter the no to check:");
        int n2=vj.nextInt();
        int[] arr=new int[n1];
        System.out.println("Enter the Array elements:");
        for(int i=0;i<n1;i++)
        {
            arr[i]=vj.nextInt();
        }
        int x=subarray(n1,n2,arr);
        System.out.println("subarray count is: "+x);
    }
}
