package Easy;

public class TwoSum {
    public static void main(String[] args) {
        int[] arrayTest = new int[]{3, 2, 4};
        int[] arrayResult = twoSum(arrayTest, 6);
        for (int j : arrayResult) {
            System.out.println(j);
        }
    }
    public static int[] twoSum(int[] nums, int targer) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++)
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == targer) {
                    result[0] = i;
                    result[1] = j;
                }
            }

        return result;
    }
}
