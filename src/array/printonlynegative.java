package array;

public class printonlynegative {
    public static void main(String[] args) {
        int[] arr = {1,2,3,-0,-3,6};

        for(int i =0 ;i<=arr.length;i++) {
            if(arr[i]<0) {
                System.out.println(arr[i]+" ");
            }
        }
    }
}
