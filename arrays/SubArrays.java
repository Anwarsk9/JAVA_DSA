package arrays;

public class SubArrays {

  public static void printSubArr(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = i; j < arr.length; j++) {
        for (int j2 = i; j2 <= j; j2++) {
          System.out.print(arr[j2] + " ");
        }
        System.out.println();
      }
      System.out.println();
    }
  }

  public static int maxSubArrSum(int arr[]) {
    int currSum = 0;
    int maxSum = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i; j < arr.length; j++) {
        currSum = 0;
        for (int k = i; k <= j; k++) {
          currSum += arr[k];
        }
        if (currSum > maxSum) maxSum = currSum;
      }
    }
    return maxSum;
  }

  public static int prefixSubArrSum(int arr[]) {
    int currSum = 0, maxSum = Integer.MIN_VALUE;
    int prefix[] = new int[arr.length];
    prefix[0] = arr[0];
    for (int i = 1; i < prefix.length; i++) {
      prefix[i] = arr[i] + prefix[i - 1];
    }

    for (int i = 0; i < prefix.length; i++) {
      for (int j = i; j < prefix.length; j++) {
        currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
        if (currSum > maxSum) maxSum = currSum;
      }
    }
    return maxSum;
  }

  public static int prefixSubArrSum2(int arr[]) {
    int currSum = 0, maxSum = Integer.MIN_VALUE;
    int prefix[] = new int[arr.length];
    prefix[0] = arr[0];
    for (int i = 1; i < prefix.length; i++) prefix[i] = arr[i] + prefix[i - 1];

    for (int i = 0; i < prefix.length; i++) {
      for (int j = i; j < prefix.length; j++) {
        currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
        maxSum = Math.max(maxSum, currSum);
      }
    }
    return maxSum;
  }

  public static int kedansAlgo(int arr[]) {
    int currSum = 0, maxSum = Integer.MIN_VALUE, neg = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
      currSum = currSum + arr[i];
      if (currSum < 0) {
        neg = Math.max(currSum, neg);
        currSum = 0;
      }
      if (maxSum == 0) if (i == arr.length - 1) return neg;
      maxSum = Math.max(maxSum, currSum);
    }
    return maxSum;
  }

  public static int kadanesAlgo(int arr[]) {
    int currSum = 0;
    int maxSum = Integer.MIN_VALUE; // Initialize maxSum to the smallest possible integer

    for (int i = 0; i < arr.length; i++) {
      currSum += arr[i]; // Add current element to currSum
      maxSum = Math.max(maxSum, currSum); // Update maxSum with the larger of currSum or maxSum

      if (currSum < 0) { // If currSum becomes negative, reset it to 0
        currSum = 0;
      }
    }

    return maxSum; // maxSum will hold the maximum sum of the contiguous subarray
  }

  public static int kadanesAlgo2(int arr[]) {
    int currSum = 0;
    int maxSum = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      currSum += arr[i];
      maxSum = Math.max(maxSum, currSum);
      if (currSum < 0) currSum = 0;
    }
    return maxSum;
  }

  public static void main(String[] args) {
    int arr[] = { -2, -3, -4, -2, -1, -5, -3 };
    // printSubArr(arr);
    // System.out.println(prefixSubArrSum2(arr));
    System.out.println(kadanesAlgo2(arr));
  }
}
