package stringBuilder;

public class StrCompress {

  static int strCompress(char[] chars) {
    int i = 0, j = chars.length;
    int index = 0;
    while (i < j) {
      int count = 1;
      while (i + count < j && chars[i] == chars[i + count]) count++;

      chars[index++] = chars[i];
      i += count;
      if (count > 1) {
        for (char c : Integer.toString(count).toCharArray()) {
          chars[index++] = c;
        }
      }
    }
    return index;
  }

  public static void main(String[] args) {
    char[] c = { 'a', 'a', 'a', 'a', 'b', 'b', 'b', 'c', 'c', 'd' };
    int len = strCompress(c);
    System.out.println(String.valueOf(c, 0, len));
  }
}
