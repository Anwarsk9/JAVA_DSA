package Strings;

public class Cration {

  public static void main(String[] args) {
    String s1 = "Anwar";
    String s2 = s1;
    String s3 = new String("Anwar");
    System.out.println(s1 == s2);
    System.out.println(s1 == s3);
    System.out.println(s2);
  }
}
