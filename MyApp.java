public class MyApp {
  public static void main(String[] args) {
    String title = "お誘い";
    String address = "a@a";
    String text = "今度飲みに行きませんか";
    email(title, address, text);
  }
  public static void email(String title, String address, String text) {
    System.out.println(address + "に、以下のメールを送信しました");
    System.out.println("件名：" + title);
    System.out.println("本文：" + text);
  }
}