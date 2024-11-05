package vijay;
import java.util.*;
public class cyclic_sort_2 {
    public static void main(String[] args)
    {
        int[] arr={4,3,2,7,8,2,3,1};
        ArrayList<Integer> list=cyclic(arr);
        for (int i = 0; list.size() > i; i++) {
            System.out.print(list.get(i)+" ");

        }
    }
    static ArrayList<Integer> cyclic (int[] arr)
    {
        int i=0;
        while(i<arr.length)
        {
            int correct=arr[i]-1;
            if(arr[correct]!=arr[i])
            {
                swap(arr,i,correct);
            }
            else {
                i++;
            }
        }
        ArrayList<Integer> list=new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=j+1)
            {
                list.add(arr[j]);
            }

        }
        return list;
    }
    static void swap(int[] arr,int a,int b)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
