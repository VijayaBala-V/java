package vijay;

import java.util.Scanner;
public class array {
    public static void array(int[] arr, int s) {
        System.out.println("Array elements are:");
        for (int i = 0; i < s; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static int[] sort(int[] arr, int s) {
        System.out.println("The sorted vijay.array is:");
        for (int i = 0; i < s - 1; i++) {
            for (int j = 0; j < s - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;

    }

    public static int binary(int[] arr, int s, int key) {
        int beg = 0;
        int end = s - 1;
        while (beg <= end) {
            int mid = (beg + end) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else {
                beg = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner vj = new Scanner(System.in);
        System.out.println("enter size of an vijay.array:");
        int s = vj.nextInt();
        int arr[] = new int[s];
        System.out.println("Enter an element: ");
        for (int i = 0; i < s; i++) {
            arr[i] = vj.nextInt();
        }
        array(arr, s);
        int x[] = array.sort(arr, s);
        for (int i = 0; i < s; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("enter the key to be search:");
        int key = vj.nextInt();
        int y = array.binary(arr, s, key);
        if (y == -1) {
            System.out.println("\n key not found in the vijay.array!");
        } else {
            System.out.println("\n "+key + " was found in the " + y + " index ");

        }
    }
}