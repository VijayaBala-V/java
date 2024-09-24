package vijay;

import java.util.*;
public class missing_no {
    public static int missing(int[] arr,int n)
    {
        int sum=0;
        for(int i=0;i<n-1;i++)
        {
            sum+=arr[i];
        }
        int expect=(n*(n+1))/2;
        return expect-sum;

    }
    public static void main(String[] args) {
        Scanner vj=new Scanner (System.in);
        System.out.println("enter the size of an array: ");
        int n=vj.nextInt();
        System.out.print("enter the array elements:");
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=vj.nextInt();
        }
        System.out.println("enter the expected array size:");
        int x=vj.nextInt();
        int ans=missing(arr,x);
        System.out.println("missing no in array is :"+ans);
    }
}
