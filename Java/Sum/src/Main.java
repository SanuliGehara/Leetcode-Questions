import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static int[] twoSum(int[] nums, int target) {
        int numLength = nums.length;
        HashMap<Integer,Integer> map1 = new HashMap<Integer,Integer>();
        //map1 = {value = index, value = index}

        for (int i =0; i< numLength; i++) {
            int check = target-nums[i];

            if (map1.containsKey(check)) {
                return new int[]{map1.get(check),i};
            } else {
                map1.put(nums[i],i);
                System.out.println(map1);
            }
        }
        return new int[] {0,0};
    }

    public static void main(String[] args) {
        int[] array = twoSum(new int[]{1,2,4,4},5);
        System.out.println(Arrays.toString(array));
    }
}