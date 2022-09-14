 // @author AJAY PRADEEP 220031985

 public class HelloWorld {

    public static void main(String[] args) {

          // args is a string array
          // It stores the incoming arguments in our program
    
        if (args.length == 0) {
            System.out.println("Hello World"); 
          //If no arguments are passed, the line of code is executed
        }
        else {
               System.out.print("Hello ");
               for (int i = 0; i < args.length; i++) {
                 System.out.print(args[i] + " "); 
               }
                
             }
        }
    }
