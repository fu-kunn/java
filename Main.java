public class Main {
  public static void main(String[] args) {
    Hero h1 = new Hero("ミナト");
    System.out.println(h1.name);
    Hero h2 = new Hero();
    System.out.println(h2.name);
  }
}


// public class Main {
//   public static void main(String[] args) {
//     Sword s = new Sword();
//     s.name = "炎の剣";
//     s.damage = 10;
//     Hero h = new Hero();
//     h.name = "ミナト";
//     h.hp = 100;
//     h.sword = s;
//     System.out.println("現在の武器は" + h.sword.name);
//   }
// }