package vijay;
import java.util.*;
public class sorting {
    public static void main(String[] args) {
        int[] arr={5,14,0,0,-9};
        insertion(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void insertion(int[] arr)
    {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0; j--) {
                if(arr[j]<arr[j-1])
                {
                    swap(arr,j,j-1);
                }
                else {
                    break;
                }

            }

        }
    }
    static void selection(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            int last=arr.length-i-1;
            int max=maxi(arr,0,last);
            swap(arr,max,last);
        }
    }
    static void swap(int[] arr,int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    static int maxi(int[] arr,int start,int last)
    {
        int max=start;
        for (int i = start; i <= last; i++) {
            if(arr[max]<arr[i])
            {
                max=i;
            }
        }
        return max;
    }
    static void bubble(int[] arr)
    {
        boolean swap;
        for (int i = 0; i <= arr.length-1; i++) {
            swap=false;
            for (int j = 1; j <= arr.length-i-1 ; j++) {
                if(arr[j]<arr[j-1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swap=true;
                }
            }
            if(!swap)
            {
                break;
            }

        }
    }
}
