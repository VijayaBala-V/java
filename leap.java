package vijay;
import java.util.*;
public class leap {
    public static void main(String[] args) {
        Scanner vj=new Scanner(System.in);
        System.out.println("ENter the year to be search:");
        int year=vj.nextInt();
        if ((year%100!=0 && year%4==0)||(year%400==0))
        {
            System.out.println(year+" is leap year!");
        }
        else{
            System.out.println(year+" is not a leap year!");
        }
    }
}
