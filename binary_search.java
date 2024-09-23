package vijay;
import java.util.*;
public class binary_search {
    public static int  binary(int[] arr,int size,int k)
    {
        int beg=0;
        int end=size-1;
        while(beg<=end)
        {
            int mid=(beg+end)/2;
            if(arr[mid]==k)
            {
                return mid;
            }
            else if(arr[mid]>k)
            {
                end=mid-1;
            }
            else if(arr[mid]<k)
            {
                beg=mid+1;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner vj=new Scanner (System.in);
        System.out.println("Enter size of an array:");
        int size=vj.nextInt();
        int[] arr=new int[size];
        for (int i=0;i<size;i++)
        {
            arr[i]=vj.nextInt();
        }
        System.out.println("enter the no to be search:");
        int k=vj.nextInt();
        Arrays.sort(arr);
        int x=binary(arr,size,k);
        if(x>-1)
        {
            System.out.println(k+" found at "+x+" index");
        }
        else {
            System.out.println(k+" not found!");
        }
        vj.close();
    }
}
