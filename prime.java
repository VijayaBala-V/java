package vijay;

import java.util.Scanner;
public class prime {

    public static void main(String[] args)
    {
        Scanner vj=new Scanner(System.in);
        System.out.println("Enter the no:");
        int n=vj.nextInt();
        if (n<=1)
        {
            System.out.println("Neither Prime Nor Composite!");
        }
        else
        {
            int c=2;
            while(c*c<=n)

            {
                if(n%c==0)
                {
              System.out.println(n+" is Not Prime!");
              break;
                }
                c+=1;
            }
            System.out.println(n+" is Prime number!");
        }
        vj.close();

    }
    
}
