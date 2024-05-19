package Easy;

public class MissingNumber {
    public static void main(String[] args) {
        int[] array1 = new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1};
        int[] array2 = new int[]{3, 0, 1};
        System.out.println(missingNum(array2));

    }

    static int missingNum(int[] nums) {
        int total = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }
        for (int i = 0; i <= nums.length; i++) {
            count += i;
        }
        return count-total;
    }
}
