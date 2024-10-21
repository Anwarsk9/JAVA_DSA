package sorting;

public class Selection {

  public static void main(String[] args) {
    int arr[] = { 3, 4, 1, 2, 3 };

    //outer loop
    for (int i = 0; i < arr.length - 1; i++) {
      int minpos = i;
      //inner loop
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[minpos] > arr[j]) {
          minpos = j;
        }
      }
      //swap
      int temp = arr[minpos];
      arr[minpos] = arr[i];
      arr[i] = temp;
    }
    Bubble.printArr(arr);
  }
}
