package vijay;

import java.util.*;
public class cyclic_sort {
    public static void main(String[] args) {
       int[] arr={2,4,5,1,3,7,6};
       cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclic(int[] arr)
    {
        int i=0;
        while(i<arr.length)
        {
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct])
            {
                swap(arr,i,correct);
            }
            else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {


        }
    }
    static void swap(int[] arr,int a,int b)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
