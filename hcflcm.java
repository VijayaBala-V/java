package vijay;
import java.util.*;
public class hcflcm {
    public static int hcf(int a,int b)
    {
        while(b!=0)
        {
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public static int lcm(int a,int b)
    {
        int max=Math.max(a,b);
        while (true)
        {
            if(max%a==0 && max%b==0)
            {
                return max;
            }
            max++;
        }
    }
    public static void main(String[] args)
    {

        Scanner vj=new Scanner(System.in);
        System.out.println("Enter first value:");
        int a=vj.nextInt();
        System.out.println("Enter second value:");
        int b=vj.nextInt();
        int lcm=lcm(a,b);
        int hcf=hcf(a,b);
        System.out.println("hcf of "+a+" and "+b+" is "+" = "+hcf);
        System.out.println("lcm of "+a+" and "+b+" is "+" = "+lcm);
    }
}
