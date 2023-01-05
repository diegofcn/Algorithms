package searchalgorithms;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {2, 12, 15, 11, 7, 19, 45};
        int target = 7;
        System.out.println(search(nums, target));

    }

    static int search(int[] nums, int target) {
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] == target) {
                return index;
            }
        }
        return -1;
    }
}