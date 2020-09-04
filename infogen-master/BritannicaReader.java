import java.net.*;
import java.io.*;

public class BritannicaReader {
    public String BritannicaReader (String userinput) throws Exception {
        String codeinput = userinput.replace(' ', '-');
        URL oracle = new URL("https://www.britannica.com/topic/" + codeinput);
        BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()));
        
        String inputLine;
        while ((inputLine = in.readLine()) != null)
           if ((inputLine.indexOf("=\"description\" content=\"" + userinput) != -1)) {
               int period = inputLine.indexOf(".\" />");
               System.out.println(inputLine.substring(38, period + 1));
        }
           else {
               System.out.print("");
        }
        in.close();
        return inputLine;
    }
}

