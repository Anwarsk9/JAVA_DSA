package stringBuilder;

public class StringCompression2 {

  public static int compress(char[] chars) {
    int n = chars.length;
    int index = 0; // Points to where we'll write in the modified array
    int i = 0; // Traverses the input array

    while (i < n) {
      char currentChar = chars[i];
      int count = 0;

      // Count occurrences of the current character
      while (i < n && chars[i] == currentChar) {
        i++;
        count++;
      }

      // Write the character to the compressed array
      chars[index++] = currentChar;

      // If the count is more than 1, write the digits of the count
      if (count > 1) {
        for (char c : Integer.toString(count).toCharArray()) {
          chars[index++] = c;
        }
      }
    }

    return index; // New length of the compressed array
  }

  public static void main(String[] args) {
    char[] chars1 = { 'a', 'a', 'b', 'b', 'c', 'c', 'c' };
    int len1 = compress(chars1);
    System.out.println("Output length: " + len1); // Should return 6
    System.out.println("Modified array: " + String.valueOf(chars1, 0, len1));

    char[] chars2 = { 'a' };
    int len2 = compress(chars2);
    System.out.println("Output length: " + len2); // Should return 1
    System.out.println("Modified array: " + String.valueOf(chars2));

    char[] chars3 = {
      'a',
      'b',
      'b',
      'b',
      'b',
      'b',
      'b',
      'b',
      'b',
      'b',
      'b',
      'b',
      'b',
    };
    int len3 = compress(chars3);
    System.out.println("Output length: " + len3); // Should return 4
    System.out.println("Modified array: " + String.valueOf(chars3));
  }
}
