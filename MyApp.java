public class MyApp {
  public static void printArray(int[] array) {
    for (int element : array) {
      System.out.println(element);
    }
  }
  public static void main(String[] args) {
    int[] array = {2, 3, 4};
    printArray(array);
  }
}