import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.io.*; 
import java.lang.*; 
import java.util.*;
import java.util.Arrays; 
import java.util.Scanner;

public class WordCounter {

    public static void main(String[] args) {

        try {

            URL url = new URL("http://www.gutenberg.org/cache/epub/768/pg768.txt");

            // read text returned by server
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

            String line;
            boolean print = false;
            int mostCommon = 0;
            int mostComIndex = 0;
            int occurrences = 0;
            int index = 0;
            
            ArrayList <String> temp = new ArrayList<String>();
            ArrayList <String> wordList = new ArrayList<String>();
            ArrayList <Integer> wordNum = new ArrayList<Integer>();
            ArrayList <Integer> indexer = new ArrayList<Integer>();
            ArrayList <String> smallWordList = new ArrayList<String>();
            
            // Scanner
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println("How many words would you like to see today?");

            int numWords = myObj.nextInt();  // Read user input
            System.out.println("Here you go: (Don't worry, it might take a while!)");  // Output user input
            
            // Actual code
            while ((line = in.readLine()) != (null)) {
                if (line.indexOf("***START OF THE PROJECT GUTENBERG EBOOK") > -1) {
                    print = true;
                    line = in.readLine();
                }
                else if (line.indexOf("***END OF THE PROJECT GUTENBERG") > -1)
                    print = false;
                if (print) {
                    line = line.toLowerCase();
                   String[] wordArray = line.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
                    for (int n = 0; n < wordArray.length; n++) {
                        if (wordArray[n] != " ")
                        wordList.add(wordArray[n]);
                    }
                }
            }
            Collections.sort(wordList);
            Set<String> set = new LinkedHashSet<>(wordList);
            smallWordList.addAll(set);
            for (int f = 0; f < smallWordList.size(); f++) {
                wordNum.add(Collections.frequency(wordList, smallWordList.get(f)));
            }
            // Frequency of occurrences
            
            List<Integer> wordNum2 = new ArrayList<>(wordNum);
            Collections.sort(wordNum2, Collections.reverseOrder());
            for (int m = 0; m < wordNum2.size(); m++) {
               indexer.add(wordNum.indexOf(wordNum2.get(m)));
            }
            indexer.remove(6);
            for (int g = 0; g < numWords; g++) {
                index = indexer.get(g);
                System.out.println((1+g) + ". " + smallWordList.get(index) + " - " + wordNum.get(index));
            }
            in.close();}
        catch (MalformedURLException e) {
            System.out.println("Malformed URL: " + e.getMessage());
        }
        catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        }
    }

}
            // System.out.println(wordNum2.get(0));