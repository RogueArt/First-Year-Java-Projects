import java.net.*;
import java.io.*;

public class MerriamWebsterReader {
    public String MerriamWebsterReader (String userinput) throws Exception {
        URL oracle = new URL("https://www.merriam-webster.com/dictionary/" + userinput);
        BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()));
        
        String inputLine;
        while ((inputLine = in.readLine()) != null)
        if ((inputLine.indexOf("t=\"" + userinput) != -1)) {
           int period = inputLine.indexOf(".");
           int start = inputLine.indexOf("t=\"" + userinput.substring(0, 1));
           System.out.println(inputLine.substring(start + 3, period + 1));
        }
        else {
            System.out.print("");
        }
        return inputLine;
    }
}