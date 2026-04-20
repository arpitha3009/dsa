package array;

public class productOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 1, 1};
        int product =1;
        for(int i =0;i<arr.length;i++) {
            product *= arr[i];
        }
        System.out.println(product);

    }
}
