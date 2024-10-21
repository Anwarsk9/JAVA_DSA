package sorting2;

public class Insertion {

  public static void main(String[] args) {
    int arr[] = { 44, 33, 55, 44, 66, 77, 66 };
    for (int i = 1; i < arr.length; i++) {
      int curr = arr[i];
      int prev = i - 1;

      while (prev >= 0 && curr < arr[prev]) {
        arr[prev + 1] = arr[prev];
        prev--;
      }
      //insertion
      arr[prev + 1] = curr;
    }
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }
}
