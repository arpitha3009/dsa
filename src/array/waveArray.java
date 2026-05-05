package array;

public class waveArray {

    // input will be sorted array like 4,5,6,7,8,9  output should be 5,4,7,6,9,8
    // basically right and left should be grater for a no and next no right and left is smaller

    public static void main(String[] args){
        wave w = new wave();
       int arr[] ={1,2,3,4,5,6,7,8};
       w.wavearr(arr);
        for(int i = 0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}


class wave{
    public static void wavearr(int[] arr){
        for(int i = 0 ;i<arr.length;i+=2){

            if(i == arr.length - 1){
                break;
            }
            int temp = arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
    }

}
