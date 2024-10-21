package Strings;

/**
 * Palindrome
 */
class Solution {

  public boolean isPalindrome2(String s) {
    // Removing non-alphanumeric characters and converting to lowercase
    StringBuilder cleaned = new StringBuilder();
    for (char c : s.toCharArray()) {
      if (Character.isLetterOrDigit(c)) {
        cleaned.append(Character.toLowerCase(c));
      }
    }

    // Check if the cleaned string is a palindrome
    String cleanedStr = cleaned.toString();
    String reversedStr = cleaned.reverse().toString();

    return cleanedStr.equals(reversedStr);
  }

  public boolean isPalindrome(String s) {
    // Initialize two pointers, one at the start and one at the end of the string
    int left = 0, right = s.length() - 1;

    while (left < right) {
      // Move the left pointer to the next alphanumeric character
      while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
        left++;
      }
      // Move the right pointer to the previous alphanumeric character
      while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
        right--;
      }
      // Compare characters at the two pointers (ignoring case)
      if (
        Character.toLowerCase(s.charAt(left)) !=
        Character.toLowerCase(s.charAt(right))
      ) {
        return false;
      }
      // Move pointers towards each other
      left++;
      right--;
    }
    return true;
  }
}

public class Palindrome extends Solution {

  static boolean palindrome(String str) {
    int i = 0, j = str.length() - 1;
    while (i < j) {
      if (str.charAt(i) == str.charAt(j)) {
        i++;
        j--;
      } else return false;
    }
    return true;
  }

  public static void main(String[] args) {
    // Solution s = new Solution();
    // palindrome()
    // String str = "racecar  %&^*(@#@#$%$!&**()) ( )6";
    // System.out.println(s.isPalindrome(str));
    Solution solution = new Solution();
    System.out.println(solution.isPalindrome("A man, a plan, a canal: Panama")); // Output: true
    System.out.println(solution.isPalindrome("race a car")); // Output: false
    System.out.println(solution.isPalindrome(" ")); // Output: true
  }
}
