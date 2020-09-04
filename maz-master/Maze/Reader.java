import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class Reader {
    private static Scanner in;
    private static BufferedWriter out;
    
    public static String read() {
        if (in == null) {
            try {
                in = new Scanner(new File("maze1.txt"));
            }
            catch (Exception e) {
                System.err.println("File cannot be opened for input!");
                e.printStackTrace();
            }
        }
        try {
            if (in.hasNext()) {
                String s = in.nextLine();
                return s;
            }
            else {
                return null;
            }
        }
        catch (Exception e) {
            System.err.println("Cannot read  file!");
            e.printStackTrace();
        }
        return "";
    }
    public static void write(String temp) {
        if (out == null) {
            try {
                out = new BufferedWriter(new FileWriter("maze1.txt"));
            }
            catch (Exception e) {
                System.err.println("File cannot be written to output!");
                e.printStackTrace();
            }
        }
        try {
            out.write(temp);
            out.newLine();
        }
        catch (Exception e) {
            System.err.println("File cannot be written!");
            e.printStackTrace();
        }
    }
    public static void saveClose() {
        if (in != null) {
            try {
                in.close();
                in = null;
            }
            catch (Exception e) {
                System.err.println("File cannot be closed!");
                e.printStackTrace();
            }
        }
        if (out != null) {
            try {
                out.close();
                out = null;
            }
            catch (Exception e) {
                System.err.println("Cannot close output file!");
                e.printStackTrace();
            }
        }
    }
    
}