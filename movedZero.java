
package interviewCode;
import java.util.Arrays;

public class movedZero {
    public static void main(String[] args) {
        int[] arr = new int[]{9, 0, 5, 8, 3, 0, 2, 7};
        movedZero(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void movedZero(int[] arr) {
        int j = 0;

        for(int i = 0; i < arr.length; ++i) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                ++j;
            }
        }

    }
}
