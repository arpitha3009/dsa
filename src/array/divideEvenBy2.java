package array;

public class divideEvenBy2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,7,6};
 //divide odd index by 10 and even index by 2
        for(int i =0 ;i<5;i++) {
            if(i%2==0) {
                System.out.print(arr[i]*10+" ");
            }
            else{
                System.out.print(arr[i]*2+" ");

            }
        }

    }
}
