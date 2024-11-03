package vijay;

import java.util.*;
public class arrays {
    public static void main(String[] args) {
        Scanner vj=new Scanner (System.in);
        System.out.println("Enter the row size: ");
        int a=vj.nextInt();
        System.out.println("Enter the column Size: ");
        int b=vj.nextInt();
        int[][] arr=new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr[i][j] = vj.nextInt();

            }
        }
        for (int i = a - 1; i >= 0; i--) {
            for (int j = arr[i].length - 1; j >= 0; j--) {
                //arr[i][j] = vj.nextInt();
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        for (int i = arr.length - 1; i >= 0; i--) {

            System.out.println(Arrays.toString(arr[i]));
        }


        for (int i = a - 1; i >= 0; i--) {
            for (int j = arr[i].length - 1; j >= 0; j--) {
                //arr[i][j] = vj.nextInt();
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        for(int[] i:arr){

                System.out.println(Arrays.toString(i));
            }
int[][] arr1={{1,2,3,4},{5,6,7},{8,9},{0}};
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();

        }
    }

    
}
