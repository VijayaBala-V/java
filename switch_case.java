package vijay;

import java.util.*;
public class switch_case {
    public static void switches(int n)
    {



            switch(n) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;

            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;

            case 5:
                System.out.println("friday");
                break;

            case 6:
                System.out.println("saturday");
                break;

            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("please enter valid day!");
        }
        }

    public static void main(String[] args)
    {
        Scanner vj=new Scanner(System.in);
        System.out.println("Enter the no to be search: ");
        int n=vj.nextInt();
        switches(n);

    }
}
