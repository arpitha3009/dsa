package array;

public class FindSingleElement {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4, 4, 5, 5};
        int i=0;
        while(i<arr.length-1) {
            if (arr[i] == arr[i+1]){
                    i = i + 2;

            }
            System.out.println( arr[i]);
            break;
        }

    }

}
