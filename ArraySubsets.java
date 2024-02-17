import java.util.ArrayList;

public class ArraySubsets {

    public static void main(String[] args) {
        int[] nums = { 1, 2, 2 };
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<ArrayList<Integer>> ansList = new ArrayList<>();
        subset(nums, al, ansList, 0);
        System.out.println(ansList);
    }

    private static void subset(int[] nums, ArrayList<Integer> al, ArrayList<ArrayList<Integer>> ansList, int idx) {

        if (idx == nums.length) {
            ansList.add(new ArrayList<Integer>(al));
            return;
        }
        int n = nums[idx];
        al.add(n);
        subset(nums, al, ansList, idx + 1);
        al.remove(al.size() - 1);
        subset(nums, al, ansList, idx + 1);
    }

}
