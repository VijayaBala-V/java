package vijay;

import java.util.*;
public class cyclic_sort_3 {
    public static void main(String[] args) {
    int[] arr={1,2,2,4};
    int[] list=cyclic(arr);
    for(int i=0;i<list.length;i++)
    {
        System.out.print(list[i]+" ");
    }
    }
    static int[] cyclic(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            }
            else {
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=j+1)
            {
                return new int[] {arr[j],j+1};
            }


        }
        return new int[] {-1,-1};
    }
        static void swap(int[] arr,int a,int b)
        {
          int temp=arr[a];
          arr[a]=arr[b];
          arr[b]=temp;
        }

}
