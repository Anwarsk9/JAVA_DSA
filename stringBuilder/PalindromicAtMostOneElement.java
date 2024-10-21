package stringBuilder;

public class PalindromicAtMostOneElement {

  static boolean isPalindrome(String str) {
    return helper(str, 0, str.length() - 1, false);
  }

  private static boolean helper(
    String str,
    int start,
    int end,
    boolean isRemoved
  ) {
    while (start < end) {
      if (str.charAt(start) != str.charAt(end)) {
        if (isRemoved) return false;
        return (
          helper(str, start + 1, end, true) || helper(str, start, end - 1, true)
        );
      }
      start++;
      end--;
    }
    return true;
  }

  public static void main(String[] args) {
    String str = "iamanwar";
    System.out.println(isPalindrome(str));
  }
}
