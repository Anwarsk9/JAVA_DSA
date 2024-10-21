package stringBuilder;

public class Palindrome {

  static boolean isPalindrome(String str) {
    int st = 0;
    int end = str.length() - 1;
    while (st < end) {
      //skip left non alphanumeric char
      while (st < end && !Character.isLetterOrDigit(str.charAt(st))) {
        st++;
      }
      //skip right non alphanumeric char
      while (st < end && !Character.isLetterOrDigit(str.charAt(end))) {
        end--;
      }
      //if not palindrome
      if (
        Character.toLowerCase(str.charAt(st)) !=
        Character.toLowerCase(str.charAt(end))
      ) return false;
      st++;
      end--;
    }
    return true;
  }

  public static void main(String[] args) {
    String str = "a man,A plan, a canal: panama";
    System.out.println(isPalindrome(str));
    String s = "cace";
    System.out.println(isPalindrome(s));
  }
}
