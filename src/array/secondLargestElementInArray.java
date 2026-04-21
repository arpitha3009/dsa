package array;

public class secondLargestElementInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 6};

        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                  // old max becomes second max
                max = arr[i]; // update max
            }

            else if (arr[i] > max2 && arr[i] != max) {
                max2 = arr[i];
            }
        }

        System.out.println("Second Largest: " + max2);
    }
}


