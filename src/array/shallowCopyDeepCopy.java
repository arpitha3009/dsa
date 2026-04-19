package array;

import java.util.Arrays;

public class shallowCopyDeepCopy {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 6};
        // shallow copy
        int[] x = arr;
        x[2]=100;
        System.out.println(arr[2]);
        System.out.println(x[2]);

        //deep copy
        int[] y = Arrays.copyOf(arr,arr.length);
        y[2]=2;
        System.out.println(arr[2]);
        System.out.println(y[2]);

    }
}
