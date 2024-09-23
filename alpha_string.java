package vijay;
import java.util.*;
public class alpha_string {
    public static StringBuilder only_string(String s)
    {
        StringBuilder s1=new StringBuilder();
        for (int i=0;i<s.length();i++)
        {
            if(Character.isLetter(s.charAt(i)))
            {
                s1.append(s.charAt(i));
            }
            else {
                continue;
            }
        }
        return s1;

    }
    public static void main(String [] args)
    {
        Scanner vj=new Scanner(System.in);
        System.out.print("Enter the String:");
        String s=vj.nextLine().trim();
        System.out.println("Alpha String is: "+s);
        StringBuilder s1=only_string(s);
        System.out.println("pure String is:"+s1);
    }
}
