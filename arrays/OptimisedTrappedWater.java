package arrays;

public class OptimisedTrappedWater {

  public static int trap(int[] arr) {
    int n = arr.length;
    int leftmax = 0;
    int rightmax = 0;
    int l = 0;
    int r = n - 1;
    int trap = 0;
    while (l < r) {
      System.out.println(l + " " + r);
      if (arr[l] <= arr[r]) {
        if (arr[l] < leftmax) trap += leftmax - arr[l]; else leftmax = arr[l];
        l++;
      } else {
        if (arr[r] < rightmax) trap += rightmax - arr[r]; else rightmax =
          arr[r];
        r--;
      }
    }
    return trap;
  }

  static int optimisedTrappedWater2(int height[]) {
    int n = height.length, trap = 0;
    int l = 0, r = n - 1, leftmax = 0, rightmax = 0;
    while (l < r) {
      if (height[l] <= height[r]) {
        if (height[l] < leftmax) trap += leftmax - height[l]; else leftmax =
          height[l];
        l++;
      } else {
        if (height[r] < rightmax) trap += rightmax - height[r]; else rightmax =
          height[r];
        r--;
      }
    }
    return trap;
  }

  public static void main(String[] args) {
    int arr[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
    System.out.println(trap(arr));
    int heights[] = { 4, 2, 0, 6, 3, 2, 5 };
    System.out.println(optimisedTrappedWater2(heights));
  }
}
