package arrays;

public class MaxArea {

  static int maxArea(int heights[]) {
    int n = heights.length;
    int lp = 0, rp = n - 1;
    int maxWater = 0;

    while (lp < rp) {
      int w = rp - lp;
      int ht = Math.min(heights[lp], heights[rp]);
      int area = w * ht;
      maxWater = Math.max(maxWater, area);

      if (heights[lp] < heights[rp]) lp++; else rp--;
    }
    return maxWater;
  }

  static int insertPos(int arr[], int tar) {
    int start = 0, end = arr.length - 1;
    while (start <= end) {
      int mid = start + (end - start);
      if (arr[mid] == tar) return mid; else if (arr[mid] < tar) start =
        mid + 1; else end = mid - 1;
    }
    return start;
  }

  public static void main(String[] args) {
    int height[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
    System.out.println(maxArea(height));
    int arr2[] = { 1, 3, 5, 6 };
    System.out.println(insertPos(arr2, 2));
  }
}
