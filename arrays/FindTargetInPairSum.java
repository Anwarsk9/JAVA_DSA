package arrays;

public class FindTargetInPairSum {

  static String paiSumWithTarget(int[] nums, int target) {
    int i = 0, j = nums.length-1;
    while (i <= j) {
      int sum = nums[i] + nums[j];
      if (sum > target) j--; else if (sum < target) i++; else {
          return Integer.toString(i) + "," + Integer.toString(j);
      }
    }
    return Integer.toString(i) + "," + Integer.toString(j);
  }

  public static void main(String[] args) {
      int[] nums = { 2, 7, 11, 15 };
    System.out.println(paiSumWithTarget(nums, 22));
  }
}
