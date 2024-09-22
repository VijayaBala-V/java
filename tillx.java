package vijay;
import java.util.*;
public class tillx {
    public static void main(String[] args)
    {
        Scanner vj=new Scanner(System.in);
        int c=0;
        while(true)
        {
            System.out.println("Enter the number:");
            char ch=vj.next().trim().charAt(0);
            if(ch=='x')
            {
                break;
            }
            else
            {
                c+=(int) (ch)-48;
            }
        }
        System.out.println(" Total: "+c);
    }
}
