package sorting2;

public class Bubble {

  public static void main(String[] args) {
    int arr[] = { 3, 2, 4, 5, 2, 4, 6 };

    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j < arr.length - 1 - i; j++) {
        if (arr[j] > arr[j + 1]) {
          //swap
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }

    for (int i : arr) {
      System.out.print(i + " ");
    }
  }
}
