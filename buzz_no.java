package vijay;

import java.util.*;
public class buzz_no {
    public static boolean buzz(int a)
    {
        if(a%7==0 || a%10==7)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner vj=new Scanner (System.in);
        System.out.println("Enter the no to be check:");
        int x=vj.nextInt();
        boolean b=buzz(x);
        if(!b)
        {
            System.out.println(x+" is not a buzz no!");
        }
        else {
            System.out.println(x+" is buzz no!");
        }
    }
}
