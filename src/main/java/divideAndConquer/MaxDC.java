package divideAndConquer;
import java.util.*;

public class MaxDC {
    public static int maxDivideAndConquer(int[] arr){
        if (arr.length == 2){
            if (arr[0] > arr[1]){
                return arr[0];
            }
            else{
                return arr[1];
            }
        }
        else if (arr.length == 1){
            return arr[0];
        }
        
        int[] firstHalf = new int[arr.length/2];
        for (int i = 0; i < firstHalf.length; i++){
            firstHalf[i] = arr[i];
        }
        int[] secondHalf = new int[arr.length/2 + 1];
        for (int i = 0; i < secondHalf.length; i++){
            secondHalf[i] = arr[i + arr.length/2 - 1];
        }

        System.out.println(maxDivideAndConquer(firstHalf));
        System.out.println(maxDivideAndConquer(secondHalf));
        System.out.println();
        return maxDivideAndConquer(firstHalf);
    }
}
