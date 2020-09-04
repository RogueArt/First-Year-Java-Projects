import java.net.*;
import java.io.*;
import java.util.Scanner;
import java.util.*;

public class WikipediaReader {
    public static void main (String []args) throws Exception {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Finding you a synopsis:");
        String tempe = myObj.nextLine();  // Read user input
        tempe = tempe.replaceAll(" ", "_");

        URL oracle = new URL("https://en.wikipedia.org/w/index.php?title=" + tempe + "&action=edit");
        BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()));
        
        String userinput = tempe.replaceAll("_", " ");
        List<String> arr = new ArrayList<String>();
        String totalstring = "";
        String inputLine;
        int count = 0;
        String str2 = "";
        String str = "";
        while ((inputLine = in.readLine()) != null) {
            if (count == 0) {
                if (inputLine.indexOf("'''") != -1) {
                    System.out.println(inputLine);
                    str2 = str2 + inputLine;
                    count++;
                }
            }
            //s1.trim();
            //String[] wordArray = inputLine.trim().split("\\s+");
            for (int n = 0; n < arr.size(); n++) {
               totalstring = totalstring + arr.get(n);
            }
        }
        while (str2.indexOf("&lt;/ref>") != -1) {
            int index = str2.indexOf("&lt;ref>");
            int index2 = str2.indexOf("&lt;/ref>");
            str = str2.substring(index, index2 + 9);
            str2 = str2.replace(str, "");
        }
        System.out.println(str2);
        in.close();
    }
}
