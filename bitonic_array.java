package vijay;
import java.util.*;
public class bitonic_array {
    public static int bitonic(int[] arr,int n)
    {
        int beg=0;
        int end=n-1;
        while(beg<=end)
        {
            int mid=(beg+end)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1])
            {
                return mid;
            }
            else if(arr[mid]>arr[mid-1])
            {
                end=mid-1;
            }
            else if(arr[mid]<arr[mid+1])
            {
                beg=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner vj=new Scanner (System.in);
        System.out.println("Enter the size of an array:");
        int a=vj.nextInt();
        System.out.print("enter the array elements: ");
        int[] arr=new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i]=vj.nextInt();
        }
        int ans=bitonic(arr,a);
        System.out.println("Bitonic Array element is: "+ans);
    }
}
