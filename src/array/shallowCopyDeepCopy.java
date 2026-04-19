package array;

public class shallowCopyDeepCopy {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 6};
        int[] x = arr;
        x[2]=100;
        System.out.println(arr[2]);
        System.out.println(x[2]);

    }
}
