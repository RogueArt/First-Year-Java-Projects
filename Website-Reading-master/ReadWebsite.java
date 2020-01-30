import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
 
public class ReadWebsite {
     
    public static void main(String[] args) {
         
        try {
             
            URL url = new URL("http://www.gutenberg.org/cache/epub/768/pg768.txt");
             
            // read text returned by server
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
             
            String line;
            String temp = "";
            boolean print = false;
            int linecount = 0;
            int characters = 0;
            int words = 0;
            while ((line = in.readLine()) != (null)) {
                if (line.indexOf("***START OF THE PROJECT GUTENBERG EBOOK") > -1) {
                    print = true;
                    line = in.readLine();
                }
                else if (line.indexOf("***END OF THE PROJECT GUTENBERG") > -1)
                    print = false;
                if (print) {
                    ++linecount;
                    String[] wordArray = line.trim().split("\\s+");
                    words += wordArray.length;
                    for (int a = 0; a < line.length(); a++)
                        if (line.charAt(a) == '!' || line.charAt(a) == '@' || line.charAt(a) == '#' ||
                        line.charAt(a) == '$' || line.charAt(a) == '%' || line.charAt(a) == '^' || 
                        line.charAt(a) == '&' || line.charAt(a) == '*' || line.charAt(a) == '(' || 
                        line.charAt(a) == ')' || line.charAt(a) == '-' || line.charAt(a) == '=' ||
                        line.charAt(a) == '+' || line.charAt(a) == '_' || line.charAt(a) == ';' ||
                        line.charAt(a) == ':' || line.charAt(a) == '.' || line.charAt(a) == ',' ||
                        line.charAt(a) == '/' || line.charAt(a) == '?' || line.charAt(a) == '!' || 
                        line.charAt(a) == '>' || line.charAt(a) == '<' || line.charAt(a) == '"' ||
                        line.charAt(a) == '|' || line.charAt(a) == '\'' || line.charAt(a) == '{' ||
                        line.charAt(a) == ']' || line.charAt(a) == '[' || line.charAt(a) == '}' ||
                        line.charAt(a) == '~' || line.charAt(a) == '`') 
                            characters++;
                }
            }
            in.close();
            System.out.println("BEGINNING OF ANALYSIS: ");
            System.out.println("Number of lines: " + linecount); 
            System.out.println("Number of words: " + words);
            System.out.println("Number of characters: " + characters); 
        }
        catch (MalformedURLException e) {
            System.out.println("Malformed URL: " + e.getMessage());
        }
        catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        }
    }
 
}