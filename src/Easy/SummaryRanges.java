package Easy;

import java.util.ArrayList;
import java.util.List;

/*
* You are given a sorted unique integer array nums.
A range [a,b] is the set of all integers from a to b (inclusive).
Return the smallest sorted list of ranges that cover all the numbers in the array exactly. That is, each element of nums is covered by exactly one of the ranges, and there is no integer x such that x is in one of the ranges but not in nums.
Each range [a,b] in the list should be output as:
"a->b" if a != b
"a" if a == b
*
* Input: nums = [0,2,3,4,6,8,9]
Output: ["0","2->4","6","8->9"]
Explanation: The ranges are:
[0,0] --> "0"
[2,4] --> "2->4"
[6,6] --> "6"
[8,9] --> "8->9"
 */

public class SummaryRanges {

    public static void main(String[] args) {
        int[] nums = new int[]{0, 2, 3, 4, 6, 8, 9};
        System.out.print(summaryRanges(nums));
    }

    public static List<String> summaryRanges(int[] nums) {
        List<String> output = new ArrayList<String>();
        int idx = 0;
        while (idx < nums.length) {
            int beg, last;
            beg = nums[idx];
            while(idx+1 < nums.length && nums[idx+1] == nums[idx] + 1){
                idx++;
            }
            last = nums[idx];
            if(beg == last) {
                output.add(beg + "");
            } else {
                output.add( beg + "->" + last );
            }
            idx++;
        }
        return output;

    }

}
