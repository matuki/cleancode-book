import com.objectmentor.utilities.args.Args;
import com.objectmentor.utilities.args.exception.ArgsException;

public class Main {
    public static void main(String[] args)   {
        try {
            Args arg = new Args("l,p#,d*", args);
            boolean logging = arg.getBoolean('l');
            int port = arg.getInt('p');
            String directory = arg.getString('d');
            executeApplication(logging, port, directory);
        } catch (ArgsException e) {
            System.out.printf("Argument error: %s\n", e.errorMessage());
        }
    }

    public static void executeApplication(boolean logging, int port, String dir) {
        System.out.printf(
                "App executed with params: \n logging: %s \n port: %s \n directory: %s", logging, port, dir);
    }
}
