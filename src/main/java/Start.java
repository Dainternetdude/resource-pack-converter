/**
 * @author Dainternetdude
 */
public class Start {

    public static void main(String [] args) {
        if (args.length < 1 || args[0].equals("nogui")) {
            new UserInterfaceFrame();
        } else {
            //run in no gui mode, take version with args
        }
    }
}
