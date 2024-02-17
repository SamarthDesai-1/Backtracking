public class SumInMatrix {

    public static void main(String[] args) {
        int[][] nums = {
                { 7, 4, 2 },
                { 6, 4, 2 },
                { 6, 5, 3 },
                { 3, 2, 1 }
        };
        int row = nums.length;
        int col = nums[row - 1].length;
        for (int i = 0; i < col; i++) {
            display(nums[i], row);
        }

    }

    private static void display(int[] nums, int row) {
        for (int i = 0; i < row - 1; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}