package vijay;
import java.util.*;
public class cyclic_sort_4 {
    public static void main(String[] args) {
        int[] arr={1,2,0};
        int a=cyclic(arr);
        System.out.println(a);
    }
    static int cyclic(int[]  arr)
    {
        int i=0;
        while(i<arr.length)
        {
            int correct=arr[i]-1;
            if(arr[i]>0 && arr[i]<=arr.length && arr[i]!=arr[correct])
            {
                swap(arr,i,correct);
            }
            else
            {
                i++;
            }
        }
        for(int index=0;index<arr.length;index++)
        {
            if(arr[index]!=index+1)
            {
                return index+1;
            }
        }
        return arr.length+1;
    }
    static void swap(int[] arr,int a,int b)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
