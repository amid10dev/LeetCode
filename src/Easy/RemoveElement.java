package Easy;

import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        int[] testNums = new int[]{3, 2, 2, 3};
        System.out.println(removeElement(testNums, 3));
        for (int a : testNums
        ) {
            System.out.print(a);
        }
    }
    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
