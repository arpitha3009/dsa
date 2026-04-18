package array;

public class passingArrayToMethod {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 6};
        System.out.println(arr[2]);
        change(arr);
        System.out.println(arr[2]);
    }
    public static void change(int[] arr){
        arr[2] =5;
    }
}
