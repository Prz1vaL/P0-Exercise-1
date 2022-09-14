 public class HelloWorld {

  public static void main(String[] args) {
   if(args.length == 0) {
      System.out.println("Hello World");
      }
   else if(args.length == 1) {
 System.out.println("Hello "+ args[0]);
 }
   else {
      System.out.println("Hello "+ args[0] + " " + args[1] + " " + args[2]);

    }
  }
}