import java.net.*;
import java.io.*;

public class WikipediaReader {
    public static void main (String []args) throws Exception {
        String userinput = "";
        String codeinput = userinput.replace(' ', '_');
        URL oracle = new URL("https://en.wikipedia.org/w/index.php?title=" + codeinput + "&action=edit");
        BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()));
        
        String inputLine;
            while ((inputLine = in.readLine()) != null)
            if ((inputLine.indexOf("'''" + userinput + "'''") != -1)) {
               int period = inputLine.indexOf(". ");
               System.out.println(inputLine.substring(0, period + 1));
            }
            else {
               System.out.print("");
            }
            in.close();
    }
}