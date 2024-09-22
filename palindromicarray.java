package vijay;
import org.w3c.dom.ls.LSOutput;
import java.io.*;
import java.util.*;
public class palindromicarray {
    public static boolean ispalindrome(ArrayList<Integer> arr,int n)
    {
        for (int i=0;i<n;i++)
        {
            boolean ans=ispali(arr.get(i));
            if (!ans)
            {
                return false;
            }
        }
        return true;
    }
    public static boolean ispali(int n)
    {
        int origional=n;
        int rev=0;
        while (n>0)
        {
            int rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        return rev==origional;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner vj = new Scanner(System.in);
        System.out.println("enter the size of an array:");
        int s = vj.nextInt();
        int a = 0;
        for (int i = 0; i < s; i++) {
            a = vj.nextInt();
            arr.add(a);
        }
        System.out.println("the elements are:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        boolean h=ispalindrome(arr,s);
        if (h)
        {
            System.out.println("palindrome array!");

        }
        else {
            System.out.println("Not palindrome array!");
        }
        vj.close();
    }

}
