package vijay;

import java.util.Scanner;
public class welcome{
    public static void main(String[] args){
        System.out.println("Welcome to Java");
        Scanner vj=new Scanner(System.in);
        System.out.println("enter a no:");
        int a=vj.nextInt();
        int even=0,odd=0;
        for (int i=a;i>=1;i--)
        {
            System.out.println(i+" ");
            if (i%2==0)
            {
                even+=i;
            }
            else
            {
                odd+=i;
            }
        }
        System.out.println("odd Sum:"+odd);
        System.out.println("Even Sum:"+even);
        vj.close();

    }
}