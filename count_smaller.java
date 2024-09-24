package vijay;
import java.util.*;
public class count_smaller {

    public static void main(String[] args) {
        Scanner vj=new Scanner (System.in);
        System.out.println("Enter sizer of an array:");
        int s=vj.nextInt();
        int[] arr=new int[s];
        for(int i=0;i<s;i++)
        {
            arr[i]=vj.nextInt();
        }
        count(arr,s);

    }

    public static void count(int[] arr, int s) {
        int[] arr1=new int[s];
        int i,j;
        for(i=0;i<s;i++)
        {
            arr1[i]=0;
        }
        for(i=0;i<s;i++)
        {
            for(j=i+1;j<s;j++)
            {
                if(arr[j]<arr[i])
                {
                    arr1[i]++;
                }
            }
        }
        System.out.println("Smaller count Array elements: ");
        for(int x:arr1)
        {
            System.out.print(x+" ");
        }
    }
}
