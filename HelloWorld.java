/**
 * This is to try to pass strings as arguments.
 * @author AJAY PRADEEP 220031985
 */
public class HelloWorld {
    /**
     * This is a main method.
     * 
     * @param args passing strings as arguments
     * @returns : void
     */
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello World");
        } else {
            System.out.println("Hello " + args[0]);
        }
    }
    /**
     * Arguments passed through command line
     */
}
