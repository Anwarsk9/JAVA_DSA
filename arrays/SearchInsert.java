package arrays;

public class SearchInsert {

  static int searchInsert(int arr[], int target) {
    int start = 0, end = arr.length - 1;
    while (start <= end) {
      int mid = start + (end - start) / 2;
      System.out.println(mid + " " + end + " " + start);
      if (arr[mid] == target) return mid; else if (arr[mid] < target) start =
        mid + 1; else {
        end = mid - 1;
      }
    }
    System.out.println(end);
    return start;
  }

  public static void main(String[] args) {
    int arr[] = { 0, 3, 5, 6, 9 };
    int target = 8;
    System.out.println(searchInsert(arr, target));
  }
}
