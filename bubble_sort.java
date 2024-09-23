package vijay;

import java.util.*;
public class bubble_sort {
    public static void bubble(ArrayList<Integer> list,int n)
    {
        for (int i=0;i<n-1;i++)
        {
            for (int j=0;j<n-i-1;j++) {
                if (list.get(j) > list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);

                }
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner vj=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        int a=0;
        System.out.println("enter the size of an array:");
        int n=vj.nextInt();
        for(int i=0;i<n;i++)
        {
            a=vj.nextInt();
            list.add(a);
        }
        bubble(list,n);
        for(int x:list)
        {
            System.out.print(x+" ");
        }
//        System.out.println(list);
        vj.close();

    }
}
