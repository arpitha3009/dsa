package array;

public class segmenting0asnd1s {
    public static void main(String args[]) {
//input will be [0,1,1,0] and output should be [0,0,1,1]
     s obj = new s();
     int[] arr ={1,0,1,0,1,0,0};
     s.ss(arr);
        for(int i = 0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
class s {
    public static void ss(int[] arr){

        int zero = 0;

        // Step 1: Count zeros
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                zero++;
            }
        }

        // Step 2: Fill zeros
        for(int i = 0; i < zero; i++){
            arr[i] = 0;
        }

        // Step 3: Fill ones
        for(int i = zero; i < arr.length; i++){
            arr[i] = 1;
        }
    }
}
