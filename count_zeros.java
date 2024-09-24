package vijay;

import java.util.*;
public class count_zeros {
    public static int count(int[] arr,int n)
    {
        int beg=0;
        int end=n-1;
        while(beg<=end)
        {
            int mid=(beg+end)/2;
            if(arr[mid]==0 && arr[mid-1]==1)
            {
                return n-mid;
            }
            else if(arr[mid]==0)
            {
                end=mid-1;
            }
            else if(arr[mid]==1)
            {
                beg=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner vj=new Scanner (System.in);
        System.out.println("enter the size of an array: ");
        int n=vj.nextInt();
        System.out.println("enter the array elements:");
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=vj.nextInt();
        }
        int ans=count(arr,n);
        if(ans==-1)
        {
            System.out.println("count the no of zeros is 0");
        }
        else
        {
            System.out.println("count the no of zeros is "+ans);
        }
    }
}
