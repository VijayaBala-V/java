package vijay;
import java.util.*;
public class tables {
    public static void main(String[] args) {
        Scanner vj=new Scanner(System.in);
        System.out.print("Enter the table you want:");
        int a=vj.nextInt();
        for (int i = 1; i <= a; i++) {
            System.out.println(i+" * "+a+" = "+i*a);
        }
    }
}
