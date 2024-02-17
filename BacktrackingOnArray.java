public class BacktrackingOnArray {

    public static void main(String[] args) {
        int size = 5;
        int[] nums = new int[size];
        fill(nums, 0, 1);
        System.out.println();

        for (int i : nums) {
            System.out.print(i + " ");
        }

    }

    private static void fill(int[] nums, int idx, int num) {
        int n = nums.length;
        if (idx == n) {
            for (int i : nums) {
                System.out.print(i + " ");
            }
            return;
        }
        nums[idx] = num;
        fill(nums, idx + 1, num + 1);
        nums[idx] = 0; // Backtracking
        // nums[idx] = nums[idx] - 2;
    }
}
