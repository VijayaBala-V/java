package vijay;
import java.util.*;
public class rotatearray {
    public static  int[] rotate(int[] arr,int n,int k)
    {

        k=k%n;
        int[] arr1=new int[n];
        int a=0;
        for(int i=k;i<n;i++)
        {
            arr1[a++]=arr[i];
        }
        for (int i=0;i<k;i++)
        {
            arr1[a++]=arr[i];
        }
        return arr1;
    }
    public static void main(String[] args)
    {
        Scanner vj=new Scanner(System.in);
        System.out.print("Enter the size of an array:");
        int size=vj.nextInt();
        int[] arr=new int[size];
        int a=0;
        for(int i=0;i<size;i++)
        {
            a=vj.nextInt();
            arr[i]=a;
        }
        System.out.println(" Enter the index element to rotate: ");
        int k=vj.nextInt();
        rotate(arr,size,k);
        for(int i:arr)
        {
            System.out.print(i+"  ");
        }
        System.out.println();
        int[] arr1=new int[size];
        arr1=rotate(arr,size,k);
        for (int i:arr1)
        {
            System.out.print(i+" ");

        }
    }
}
