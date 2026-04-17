package array;

public class maxelement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,7,6};
        int max=arr[0];
        for(int i =0 ;i<5;i++) {
            if(arr[i]>max) {
                max = arr[i];
            }
        }

        System.out.println("max:"+max);
    }
}
