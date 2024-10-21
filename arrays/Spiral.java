package arrays;

public class Spiral {

  public static int[][] spiralOrder(int[][] matrix) {
    int startRow = 0;
    int endRow = matrix.length - 1;
    int startCol = 0;
    int endCol = matrix[0].length - 1;
    int[][] result = new int[endRow + 1][endCol + 1];

    while (startRow <= endRow && startCol <= endCol) {
      for (int j = startCol; j <= endCol; j++) {
        result[startRow][j] = matrix[startRow][j];
      }
      for (int i = startRow + 1; i <= endRow; i++) {
        result[i][endCol] = matrix[i][endCol];
      }
      for (int j = endCol - 1; j >= startCol; j--) {
        if (startRow == endRow) break;
        result[endRow][j] = matrix[endRow][j];
      }
      for (int i = endRow - 1; i >= startRow + 1; i--) {
        if (startCol == endCol) break;
        result[i][startCol] = matrix[i][startCol];
      }
      startRow++;
      startCol++;
      endCol--;
      endRow--;
    }

    return result;
  }

  public static void main(String[] args) {
    int arr[][] = {
      { 1, 2, 3, 4 },
      { 9, 10, 11, 12 },
      { 5, 6, 7, 8 },
      { 13, 14, 15, 16 },
    };

    int res[][] = spiralOrder(arr);
    for (int i = 0; i < res.length; i++) {
      for (int j = 0; j < res[0].length; j++) {
        System.out.print(res[i][j] + " ");
      }
    }
    System.out.println();
  }
}
