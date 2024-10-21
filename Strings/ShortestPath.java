package Strings;

public class ShortestPath {

  static float routeShortestPath(String direction) {
    String path = direction.toUpperCase();
    for (int i = 0; i < path.length(); i++) {
      char c = path.charAt(i);
      if (c != 'N' && c != 'S' && c != 'E' && c != 'W') {
        System.out.println("Wrong Direction Entered!");
        return 0;
      }
    }
    int x = 0, y = 0;
    for (int i = 0; i < path.length(); i++) {
      char c = path.charAt(i);
      if (c == 'N') y++; else if (c == 'S') y--; else if (
        c == 'E'
      ) x++; else x--;
    }
    int x2 = x * x;
    int y2 = y * y;
    return (float) Math.sqrt(x2 + y2);
  }

  public static void main(String[] args) {
    String path = "wneenesennn";
    System.out.println(
      routeShortestPath(path) > 0 ? routeShortestPath(path) : " "
    );
  }
}
