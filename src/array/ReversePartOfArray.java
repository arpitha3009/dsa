package array;

public class ReversePartOfArray {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50,60,70,80,90};
        //need to reverse only 20,30,40,50in thev array

        int i =2 ;
        int j =5;
        while(i<j){
            int temp = arr[i];

            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int k =0;k<arr.length;k++) {
            System.out.print(arr[k]+" ");

        }
    }
}
