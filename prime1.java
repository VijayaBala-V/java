package vijay;

import java.util.*;
public class prime1 {
    public static void prime(int n) {
        if (n <= 0) {
            System.out.println("please enter valid nos");
        }
        if (n == 1) {
            System.out.println("neither prime nor composite");
        }
        for(int i=2;i<n;i++)
        {
            if(isprime(i))
            {
                System.out.print(i+" ");
            }
        }
    }
        public static boolean isprime(int n){
        int c=2;
       while (c*c <= n)
       {
           if(n%c==0)
           {
               return false;
           }
           c+=1;

       }
            return c*c>n;
    }
    public static void main(String[] args)
    {
        Scanner vj=new Scanner(System.in);
        System.out.println("enter a value: ");
        int a=vj.nextInt();
        prime(a);
    }
}
