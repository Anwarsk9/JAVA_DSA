package arrays;

public class BuyAndSellStock {

  public static int trappedRainWater(int heights[]) {
    int n = heights.length;
    int leftMax[] = new int[n];
    leftMax[0] = heights[0];
    for (int i = 1; i < n; i++) leftMax[i] =
      Math.max(leftMax[i - 1], heights[i]);
    int rightMax[] = new int[n];
    rightMax[n - 1] = heights[n - 1];
    for (int i = n - 2; i >= 0; i--) rightMax[i] =
      Math.max(heights[i], rightMax[i + 1]);
    int trappedRainWater = 0;
    for (int i = 0; i < rightMax.length; i++) {
      int waterLevel = Math.min(leftMax[i], rightMax[i]);
      trappedRainWater += waterLevel - heights[i];
    }
    return trappedRainWater;
  }

  public static int buyAndSellStock(int prices[]) {
    int buyingPrice = Integer.MAX_VALUE;
    int maxProfit = 0;
    for (int j = 0; j < prices.length; j++) {
      if (buyingPrice < prices[j]) {
        int profit = prices[j] - buyingPrice;
        maxProfit = Math.max(profit, maxProfit);
      } else {
        buyingPrice = prices[j];
      }
    }
    return maxProfit;
  }

  public static void main(String[] args) {
    int heights[] = { 4, 2, 0, 6, 3, 2, 5 };
    System.out.println(trappedRainWater(heights));
    int prices[] = { 7, 1, 5, 3, 6, 4 };
    System.out.println(buyAndSellStock(prices));
  }
}
