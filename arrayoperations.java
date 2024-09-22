package vijay;
import java.util.*;
public class arrayoperations {
    public static void main(String[] args)
    {
        Scanner vj=new Scanner (System.in);
        System.out.print("Enter the size of an array:");
        int s=vj.nextInt();
        int[] arr=new int[s];
        System.out.println("Enter array elements are:");
        for(int i=0;i<s;i++)
        {
            arr[i]=vj.nextInt();
        }
        for(int i:arr){
            System.out.println(i+" ");
        }
        System.out.println(arr[0]);
        arr[1]=56;
        System.out.println(arr[1]);
        System.out.println("Array length is :"+arr.length);
        int[] arr1=new int[s];
        System.arraycopy(arr,0,arr1,0,s);
        System.out.println("Copy array elements are:");
        for(int i:arr1)
        {
            System.out.print(i+" ");
        }
        Arrays.sort(arr);
        for(int i:arr)
        {
            System.out.println(i+" ");
        }
        System.out.println("Enter the element to be search:");
        int k=vj.nextInt();
        int b=Arrays.binarySearch(arr,k);
        if(b>0)
        {
            System.out.println(k+" element found at "+b+" Index");
        }
        else{
            System.out.println("Element not found in an array!");
        }
    }
}
