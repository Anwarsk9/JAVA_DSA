package arrays;

public class index {

  static int binarySearch(int arr[], int key) {
    int start = 0;
    int end = arr.length - 1;
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (arr[mid] == key) {
        return mid;
      } else if (arr[mid] < key) {
        start = mid + 1;
      } else if (arr[mid] > key) {
        end = mid - 1;
      }
    }
    return -1;
  }

  static void revArr(int arr[]) {
    int start = 0;
    int end = arr.length - 1;
    while (start < end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }

  public static void pairsInArr(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        System.out.print("(" + i + "," + j + ")");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    int arr[] = { 2, 4, 6, 8, 10 };

    pairsInArr(arr);
    // revArr(arr);
    // for (int i : arr) {
    //   System.out.print(i + " ");
    // }
    // int key = 8;
    // int res = binarySearch(arr, key);
    // System.out.println("Key found at index: " + (res > 0 ? res + 1 : res));
  }
}
