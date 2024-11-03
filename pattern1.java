package vijay;

import java.util.*;
public class pattern1 {
    public static void pattern(int a)
    {
        int x=a;
        for(int i=a;i>0;i--)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            for (int k = a; k < (a*k); k--) {
                System.out.print(x + " ");

            }
            x--;
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Scanner vj=new Scanner (System.in);
        System.out.println("Enter a no you want: ");
        int a=vj.nextInt();
        pattern(a);

    }
}
