package array;

import java.util.Arrays;

public class sorttInAsc {
    public static void main(String args[]) {
        int[] arr = {1, 5, 9, 4};
        print(arr);
        Arrays.sort(arr);
        print(arr);

    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println(" ");

    }
}
