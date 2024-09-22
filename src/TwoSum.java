import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(target - nums[i])) {
                int[] arr = {hm.get(target - nums[i]), i};
                return arr;
            } else {
                hm.put(nums[i], i);
            }
        }
        int arr[] = {-1, -1};
        return arr;
    }
}