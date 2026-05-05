package array;

import java.util.Arrays;

public class MissingInArray {
    public static void main(String args[]) {
//it always start from 1 only
    int[] arr = {1,3,2,7,6,4};


      int n = arr.length +1;
      int sum = n*(n+1)/2;
      int arraySum = 0;

        for (int i = 0; i < arr.length; i++) {
            arraySum += arr[i];
        }
        int r = sum - arraySum;
         System.out.println(r);

    }

            //can do this but more time complexity
        /*    Arrays.sort(arr);

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i + 1] != arr[i] + 1) {
                System.out.println(arr[i] + 1);
                return;
            }
        }
        System.out.println(arr[arr.length - 1] + 1); */




    }

