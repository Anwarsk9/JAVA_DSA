package sorting2;

public class Counting {

  public static void main(String[] args) {
    int arr[] = { 3, 2, 4, 5, 4, 6, 2, 4, 3, 2 };
    int largest = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) largest = Math.max(largest, arr[i]);

    int count[] = new int[largest + 1];
    for (int i = 0; i < arr.length; i++) {
      count[arr[i]]++;
    }

    int j = 0;
    for (int i = 0; i < count.length; i++) {
      while (count[i] > 0) {
        arr[j] = i;
        j++;
        count[i]--;
      }
    }
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }
}
