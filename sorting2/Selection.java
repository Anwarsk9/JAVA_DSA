package sorting2;

public class Selection {

  public static void main(String[] args) {
    int arr[] = { 44, 22, 5559, 4444, 1333, 555 };

    for (int i = 0; i < arr.length - 1; i++) {
      int minpos = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[minpos] > arr[j]) minpos = j;
      }
      //swap
      int temp = arr[minpos];
      arr[minpos] = arr[i];
      arr[i] = temp;
    }
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }
}
