package vijay;

import java.util.*;
public class pattern {
    public static void main(String[] args) {
        Scanner vj=new Scanner (System.in);
        System.out.println("enter the pattern size");
        int s=vj.nextInt();
        for(int i=0;i<=s;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(" ");
            }
            for (int k = 0; k <=(s-i-1) ; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
