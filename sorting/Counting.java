package sorting;

public class Counting {

  public static void main(String[] args) {
    int arr[] = { 3, 2, 5, 6, 7, 3, 4, 5 };
    int largest = Integer.MIN_VALUE;
    //finding out largest value
    for (int k = 0; k < arr.length; k++) largest = Math.max(largest, arr[k]);
    //counting occurance of num
    int count[] = new int[largest + 1];
    for (int i = 0; i < arr.length; i++) {
      count[arr[i]]++;
    }
    //printing occurance
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
