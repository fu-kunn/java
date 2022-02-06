public class MyApp {

 public static void main(String[] args) {

 String signal = "green";
 switch (signal) {
  case "red":
   System.out.println("Stop!");
   break;
  case "green":
  case "blue":
   System.out.println("go!");
   break;
  case "ryellow":
   System.out.println("caution!");
   break;
  default:
   System.out.println("wrong signal!");
   break;
 }

}
}