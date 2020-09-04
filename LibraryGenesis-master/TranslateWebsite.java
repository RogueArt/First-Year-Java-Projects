import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class TranslateWebsite {    
    public static void main(String[] args) {
        try {

            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println("What book would you like to read in today?");
            String tempe = myObj.nextLine();  // Read user input

            
            URL url = new URL(tempe);

            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream())); 
            String line;
            int start = 0;
            int a = 0; 
            int b = 0; 
            int c = 0; 
            boolean print = false;
            line = in.readLine();
            
            //"*** START OF THE PROJECT GUTENBERG EBOOK, THE KORAN ***"
            while (line != null) {
                if(print){
                    a++;
                    int len = line.length();
                    char[] letters2 = line.toCharArray();
                    for (char i:letters2){
                        if((Character.isDigit(i))||(Character.isLetter(i))||(i==' ')){
                            continue;
                        }
                        b++;
                    }
                    String[] word = line.split(" ", -1);
                    for(String i:word){
                        c++;
                    }
                    String result = " ";
                    for(int n = 0; n < word.length; n++){
                        char[] letters = word[n].toCharArray();
                        int wordlength = word[n].length();
                        char punctuation = ' ';
                        for (char i:letters){
                            if(!(Character.isDigit(i))&&!(Character.isLetter(i))&&!(i==' ')){
                                punctuation = i;
                            }
                        }    
                        if(word[n].length() > 0){
                            if(letters[0]=='a' || letters[0]=='e' || letters[0]=='i' || letters[0]=='o' || letters[0]=='u' || letters[0]=='A' || letters[0]=='E' || letters[0]=='I' || letters[0]=='O' || letters[0]=='U'){
                                for(int k = 0; k < wordlength; k++){
                                    if((Character.isDigit(letters[k]))||(Character.isLetter(letters[k]))||(letters[k]==' ')){
                                        result += letters[k];
                                    }
                                }
                                result += "ay" + punctuation; 
                            }
                            else{
                                for(int x = 1; x < wordlength; x++){
                                    if((Character.isDigit(letters[x]))||(Character.isLetter(letters[x]))||(letters[x]==' ')){
                                        result += letters[x];
                                    }
                                }
                                result += letters[0]+"ay" +punctuation;
                            }
                        }
                        else{
                            result += word[n];
                        }
                    }
                    System.out.println(result);
                }
                if(line.equals("***START OF THE PROJECT GUTENBERG EBOOK WUTHERING HEIGHTS***")){
                    print = true;
                }
                line = in.readLine();
                if(line.equals("***END OF THE PROJECT GUTENBERG EBOOK WUTHERING HEIGHTS***")){
                    break;
                }
            }
            in.close();
        }
        catch (MalformedURLException e) {
            System.out.println("Malformed URL: " + e.getMessage());
        }
        catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        }
    }
}