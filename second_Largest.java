package vijay;
import java.util.*;
public class second_Largest {
    public static void main(String[] args)
    {
        Scanner vj=new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<>();
        System.out.println("enter the size of an arrayList");
        int s=vj.nextInt();
        System.out.println(" enter the elements:");
        int a=0;
        for(int i=0;i<s;i++)
        {
            a=vj.nextInt();
            arr.add(a);
        }
        Collections.sort(arr,Collections.reverseOrder());
        for(int i=1;i<s;i++)
        {
            if(arr.get(i) != arr.get(0))
            {
                System.out.println("Second Largest element is: "+arr.get(i));
                break;
            }
            else {
                System.out.println("there is no second largest element in an arrayList!");
            }
        }
    }
}
