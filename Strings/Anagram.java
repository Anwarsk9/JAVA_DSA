package Strings;

import java.util.*;

public class Anagram {

  static boolean isAnagram(String str1, String str2) {
    if (str1.length() == str2.length()) {
      char c1[] = str1.toCharArray();
      char[] c2 = str2.toCharArray();
      Arrays.sort(c1);
      Arrays.sort(c2);
      return Arrays.equals(c1, c2);
    }
    return false;
  }

  public static void main(String[] args) {
    String str1 = "card";
    String str2 = "racc";
    System.out.println(isAnagram(str1, str2));
    System.out.println((int) 'A' + " " + (int) 'z');
  }
}
