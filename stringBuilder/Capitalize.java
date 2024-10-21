package stringBuilder;

public class Capitalize {

  public static void main(String[] args) {
    StringBuilder s = new StringBuilder("i am anwar ");
    StringBuilder newStr = new StringBuilder();
    newStr.append(Character.toUpperCase(s.charAt(0)));

    for (int i = 1; i < s.length(); i++) {
      if (i < s.length() - 1 && s.charAt(i) == ' ') {
        newStr.append(s.charAt(i));
        i++;
        char c = Character.toUpperCase(s.charAt(i));
        newStr.append(c);
      } else {
        newStr.append(s.charAt(i));
      }
    }
    System.out.println(newStr);
  }
}
