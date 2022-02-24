import java.io.*;

public class CopyUtil {
    public static void copyStream(InputStream input, OutputStream output)
                                                       throws IOException {
        System.out.println("Copying...");
        byte[] buffer = new byte[10240];
        int n;
        while ((n = input.read(buffer)) > 0) {
            output.write(buffer, 0, n); /*****/
        }
        output.flush();
        System.out.println("Copy complete.");
    }
    public static void backupLogs() throws IOException {
        InputStream input = new FileInputStream("logs.txt");;
        OutputStream output = new FileOutputStream("backup.txt");
        try {
            System.out.println("Backing up log file...");
            copyStream(input, output);
            System.out.println("Log file backed up!");
        } finally {
            System.out.println("Closing streams...");
            input.close();
            output.close();
            System.out.println("Streams closed!");
        } 
    }
    public static void main(String[] args) {
        try {
            System.out.println("Beginning backup.");
            backupLogs();
            System.out.println("Backup complete.");
        }
        catch(IOException ioe) {
            System.err.println("Backup failed!" );
        }
    }   
}