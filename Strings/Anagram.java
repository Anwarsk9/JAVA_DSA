package Strings;

import java.util.Arrays;

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

  public static boolean validAnagram(String str1, String str2) {
    int count[] = new int[26];

    //count the str1 char freq
    for (int i : str1.toCharArray()) {
      count[i - 'a']++;
    }
    //decrement freq of char
    for (int i : str2.toCharArray()) {
      count[i - 'a']--;
    }
    for (int i : count) {
      if (i != 0)
        return false;
    }
    return true;
  }

  public static void main(String[] args) {
    String str1 = "car";
    String str2 = "rac";
    System.out.println(validAnagram(str1, str2));
    System.out.println(isAnagram(str1, str2));
    System.out.println((int) 'A' + " " + ('z'-'a'));
  }
}
