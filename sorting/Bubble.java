package sorting;

public class Bubble {

  public static void printArr(int arr[]) {
    for (int i : arr) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void main(String args[]) {
    int arr[] = { 3, 2, 4, 5, 6 };
    //no of turns
    for (int i = 0; i < arr.length - 1; i++) {
      //sorting elemnt
      for (int j = 0; j < arr.length - 1 - i; j++) {
        if (arr[j] > arr[j + 1]) {
          //value
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
    printArr(arr);
  }
}
