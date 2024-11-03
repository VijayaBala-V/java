package vijay;

import java.util.*;
public class linear_search {
    public static int linear(int[] arr,int size,int target){
        for (int index = 0; index < size; index++) {
            {
                if (arr[index]==target)
                {
                    return index;
                }
            }

        }
        return -1;

    }
    public static void main(String[] args) {
        Scanner vj=new Scanner (System.in);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println("Enter the size of an array:");
        int a=vj.nextInt();
        int[] arr=new int[a];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < a; i++) {
            arr[i]=vj.nextInt();
        }
        System.out.println("enter the element to be search!");
        int s=vj.nextInt();
        int b=linear(arr,a,s);
        System.out.println("Your Searched element at the index!="+b);
    }
}
