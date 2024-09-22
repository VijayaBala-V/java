package vijay;
import java.util.*;
public class maxmin {
    public static int max_(int a,int b,int c)
    {
        int x=Math.max(c,Math.max(a,b));
        return x;
    }
    public static int min_(int a,int b,int c)
    {
        int x=Math.min(c,Math.min(a,b));
        return x;
    }
    public static void main(String[] args)
    {
        Scanner vj=new Scanner(System.in);
        System.out.print("Enter a value:");
        int a=vj.nextInt();
        System.out.print("enter b value:");
        int b=vj.nextInt();
        System.out.print("enter c value:");
        int c=vj.nextInt();
        int  x=max_(a,b,c);
        int y=min_(a,b,c);
        System.out.println("Maximum value is -> "+x);
        System.out.println("minimum value is -> "+y);
    }
}
