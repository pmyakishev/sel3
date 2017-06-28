import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by admin on 3/22/17.
 */
public class CrunchifyThrowThrows {


    @SuppressWarnings("unused")
    public static void main(String args[]) throws Exception {
        FileInputStream crunchifyStream1 = null;
        FileInputStream crunchifyStream2 = null;
        String fileName = "Crunchify.txt";

        System.out.println("main: Starting " + CrunchifyThrowThrows.class.getName() + " with file name = " + fileName);

        // get file input stream 1
        try {
            crunchifyStream1 = crunchifyTest1(fileName);
        } catch (FileNotFoundException ex) {
            System.out.println("main: Oops, FileNotFoundException caught");
        } catch (Exception ex) {
            System.out.println("main: Oops, genreal exception caught");
        }

        // get file input stream 2
        crunchifyStream2 = crunchifyTest2(fileName);
        System.out.println("main: " + CrunchifyThrowThrows.class.getName() + " ended");
    }

    public static FileInputStream crunchifyTest1(String fileName) throws FileNotFoundException {
        FileInputStream crunchifyStream = new FileInputStream(fileName);
        System.out.println("crunchifyTest1: File input stream created");
        return crunchifyStream;
    }

    public static FileInputStream crunchifyTest2(String fileName) throws Exception {
        FileInputStream crunchifyStream = null;
        try {
            crunchifyStream = new FileInputStream(fileName);
        } catch (FileNotFoundException ex) {
            throw new Exception("crunchifyTest2: Oops, FileNotFoundException caught");
            //System.out.println("crunchifyTest2: Oops, FileNotFoundException caught");
        } finally {
            System.out.println("crunchifyTest2: finally block");
        }
        System.out.println("crunchifyTest2: Returning from crunchifyTest2");
        return crunchifyStream;
    }

}