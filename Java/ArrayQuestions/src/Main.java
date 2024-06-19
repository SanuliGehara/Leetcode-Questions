
public class Main {
    /*
    Input: nums = [2,11,10,1,3], k = 10
    Output: 3

    Explanation:
    After one operation, nums becomes equal to [2, 11, 10, 3].
    After two operations, nums becomes equal to [11, 10, 3].
    After three operations, nums becomes equal to [11, 10].
    At this stage, all the elements of nums are greater than or equal to 10 so we can stop.
    It can be shown that 3 is the minimum number of operations needed
    so that all elements of the array are greater than or equal to 10.
    */

    public static void main(String[] args) {
        int[] array = {2,11,10,1,3};
        int k = 10;
        System.out.println(minOperations(array,k));
    }

    public static int minOperations(int[] nums, int k) {
        int count = 0;

        for (int i = 0; i< nums.length; i++) {
            if (nums[i] < k) {
                count += 1;
            }
        }
        return count;
    }
}