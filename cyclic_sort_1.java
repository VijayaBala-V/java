package vijay;

import java.util.*;
public class cyclic_sort_1 {
    public static void main(String[] args) {
        int[] arr={3,0,2,6,5,1};
        int miss=cyclic(arr);
        System.out.println("Missing element is "+miss);

    }
    static int cyclic(int[] arr)
    {
        int i=0;
        while(i<arr.length )
        {
            int correct=arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[correct])
            {
                swap(arr,i,correct);
            }
            else {
                i++;
            }


            }
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=j)
            {
                return j;
            }

        }
        return arr.length;
    }
    static void swap(int[] arr,int a,int b)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
