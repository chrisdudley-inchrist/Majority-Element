import java.util.Arrays;

/**
 * Given an array of size n, find the majority element.
 * The majority element is the element that appears more
 * than ⌊ n/2 ⌋ times.
 *
 * You may assume that the array is non-empty and the majority
 * element always exist in the array.
 *
 * Example 1:
 *
 * Input: [3,2,3]
 * Output: 3
 * Example 2:
 *
 * Input: [2,2,1,1,1,2,2]
 * Output: 2
 */

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(array));
    }

    private static int majorityElement(int[] array) {
        int count = 1;
        int maxVal = 0;
        int maxCount = 1;
        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {

            if (i > 0 && array[i] == array[i - 1]) {
                count++;
                if (count > maxCount) {
                    maxVal = array[i];
                    maxCount = count;
                }
            } else {
                count = 1;
            }
        }
        return maxVal;
    }
}