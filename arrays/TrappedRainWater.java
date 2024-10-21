package arrays;

/**
 * TrappedRainWater
 */
public class TrappedRainWater {

  public static int trappedRainWater(int heights[]) {
    int n = heights.length;
    int leftMax[] = new int[n];
    leftMax[0] = heights[0];
    //left max
    for (int i = 1; i < leftMax.length; i++) leftMax[i] =
      Math.max(heights[i], leftMax[i - 1]);
    //right max
    int rightMax[] = new int[n];
    rightMax[n - 1] = heights[n - 1];
    for (int i = n - 2; i >= 0; i--) rightMax[i] =
      Math.max(heights[i], rightMax[i + 1]);
    int trappedWater = 0;
    for (int i = 0; i < rightMax.length; i++) {
      int waterLevel = Math.min(leftMax[i], rightMax[i]);
      trappedWater += waterLevel - heights[i];
    }
    return trappedWater;
  }

  public static int trappedRainWater2(int heights[]) {
    int n = heights.length;
    int leftMax[] = new int[n];
    leftMax[0] = heights[0];
    for (int i = 1; i < n; i++) leftMax[i] =
      Math.max(leftMax[i - 1], heights[i]);
    int rightMax[] = new int[n];
    rightMax[n - 1] = heights[n - 1];
    for (int i = n - 2; i >= 0; i--) rightMax[i] =
      Math.max(rightMax[i + 1], heights[i]);
    int trappedWater = 0;
    for (int i = 0; i < n; i++) {
      int waterLevel = Math.min(leftMax[i], rightMax[i]);
      trappedWater += waterLevel - heights[i];
    }
    return trappedWater;
  }

  public static int trappedRainWater3(int heights[]) {
    int n = heights.length;
    int leftMax[] = new int[n];
    leftMax[0] = heights[0];
    for (int i = 1; i < leftMax.length; i++) {
      leftMax[i] = Math.max(heights[i], leftMax[i - 1]);
    }
    int rightMax[] = new int[n];
    rightMax[n - 1] = heights[n - 1];
    for (int i = n - 2; i >= 0; i--) rightMax[i] =
      Math.max(heights[i], rightMax[i + 1]);
    int trappedWater = 0;
    for (int i = 0; i < rightMax.length; i++) {
      int waterLevel = Math.min(leftMax[i], rightMax[i]);
      trappedWater += waterLevel - heights[i];
    }
    return trappedWater;
  }

  public static int buyAndSellStock(int prices[]) {
    int buyPrice = Integer.MAX_VALUE;
    int maxProfit = 0;
    for (int i = 0; i < prices.length; i++) {
      if (buyPrice < prices[i]) {
        int profit = prices[i] - buyPrice;
        maxProfit = Math.max(maxProfit, profit);
      } else {
        buyPrice = prices[i];
      }
    }
    return maxProfit;
  }

  int trap(int heights[]) {
    int n = heights.length;
    int l = 0, leftmax = 0;
    int r = n - 1, rightmax = 0;
    int trap = 0;
    while (l < r) {
      if (heights[l] <= heights[r]) {
        if (heights[l] < leftmax) trap += leftmax - heights[l]; else leftmax =
          heights[l];
        l++;
      } else {
        if (heights[r] < rightmax) trap +=
          rightmax - heights[r]; else rightmax = heights[r];
        r--;
      }
    }
    return trap;
  }

  public static void main(String[] args) {
    TrappedRainWater t = new TrappedRainWater();
    // int prices[] = { 7, 1, 5, 3, 6, 4 };
    // System.out.println(buyAndSellStock(prices));
    int heights[] = { 4, 2, 0, 6, 3, 2, 5 };
    System.out.println(t.trap(heights));
    int arr[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
    System.out.println(trappedRainWater(arr));
    // System.out.println(trappedRainWater2(heights));
    // System.out.println(trappedRainWater3(heights));
  }
}
