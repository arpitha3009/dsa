package array;

public class minelement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,7,6};
        int max=arr[0];
        for(int i =0 ;i<5;i++) {
            if(max>arr[i]) {
                max = arr[i];
            }
        }

        System.out.println("max:"+max);
    }
}
