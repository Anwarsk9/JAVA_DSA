package sorting3;

public class Sorting {

  public static void BubbleSort(int arr[]) {
    for (int traverse = 0; traverse < arr.length - 1; traverse++) {
      //ele by element
      for (int i = 0; i < arr.length - 1 - traverse; i++) {
        if (arr[i] > arr[i + 1]) {
          //swap
          int temp = arr[i];
          arr[i] = arr[i + 1];
          arr[i + 1] = temp;
        }
      }
    }
  }

  public static void selectionSort(int arr[]) {
    for (int i = 0; i < arr.length - 1; i++) {
      int minElPos = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[minElPos] > arr[j]) minElPos = j;
      }
      //swap
      int temp = arr[minElPos];
      arr[minElPos] = arr[i];
      arr[i] = temp;
    }
  }

  public static void insertionSort(int arr[]) {
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
  }

  public static void countingSort(int arr[]) {
    int largest = Integer.MIN_VALUE;
    for (int i : arr) largest = Math.max(largest, i);

    int count[] = new int[largest + 1];
    for (int i : arr) count[i]++;

    int j = 0, k = 0;
    for (int i : count) {
      while (i > 0) {
        arr[j] = k;
        j++;
        i--;
      }
      k++;
    }
  }

  static void printArr(int arr[]) {
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }

  public static void main(String[] args) {
    int arr[] = { 66, 777, 33, 4444, 555, 22, 777 };
    // BubbleSort(arr);
    // selectionSort(arr);
    insertionSort(arr);
    // countingSort(arr);
    printArr(arr);
  }
}
