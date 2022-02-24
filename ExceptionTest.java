import java.io.FileNotFoundException;

public class ExceptionTest {
    private static void foo(boolean flag) throws Exception {
        if (flag) {
            throw new IndexOutOfBoundsException("Herp");
        }
        else {
            throw new FileNotFoundException("Derp");
        }
    }
    public static void main(String [] args) {
        try {
            foo(true);
        } catch (FileNotFoundException fnfe) {
            System.out.println("Caught File Exception with message: " + fnfe.getMessage());
        } catch (IndexOutOfBoundsException ioobe) {
            System.out.println("Caught Index Exception with message: " + ioobe.getMessage());
        } catch (Exception e) {
            System.out.println("Caught general exception");
        } finally {
            System.out.println("Done!");
        }
    }
}