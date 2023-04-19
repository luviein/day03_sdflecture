package sg.edu.nus.iss;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        if (args.length > 0) {
            for (int i = 0; i < args.length; i++) { //to loop through the argument

                System.out.println("Argument " + i + ": " + args[i]);
            }

        } else {
            System.out.println("You did not pass in arguments");
        }
    }
}
