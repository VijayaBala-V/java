package vijay;
import java.util.*;
public class arraylistops {
    public static void main(String[] args)
    {
        ArrayList<Integer> arr=new ArrayList<>();
        Scanner vj=new Scanner (System.in);
        System.out.println("Enter the Size of an ArrayList:");
        int s=vj.nextInt();
        int a=0;
        for (int i=0;i<s;i++)
        {
            a=vj.nextInt();
            arr.add(a);
        }
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
        arr.add(2,32);
        System.out.println("\n"+arr);
        arr.set(2,33);
        System.out.println(arr);
        System.out.println(arr.size());
        boolean x=arr.contains(33);
        System.out.println(x);
        Collections.sort(arr,Collections.reverseOrder());
        System.out.println(arr);
        vj.close();

    }
}
