package vijay;
import java.util.*;
public class ascii_char {
    public static void asci(String s)
    {
        StringBuilder v=new StringBuilder();
        HashMap<Character,Integer> map=new HashMap<>();
        int sum=0;
        for (char ch:s.toCharArray())
        {
            int value=(int) (ch);
            map.put(ch,value);
            v.append(value).append("+");
            sum+=value;
        }
        v.setLength(v.length()-1);
        System.out.println(sum+"("+v+")");

    }
    public static void main(String[] args) {
        Scanner vj=new Scanner (System.in);
        System.out.print("Enter the String:");
        String s=vj.nextLine().trim();
        asci(s);
        vj.close();
    }



}
