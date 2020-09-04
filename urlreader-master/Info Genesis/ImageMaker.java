import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.net.*;
import java.io.*;

class ImageMaker {  
    public static void main(String[] args) throws IOException {
    String userinput = "banana";
    URL oracle = new URL("https://commons.wikimedia.org/wiki/" + userinput);
    BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()));
    String inputLine;
    String path = null;
        while ((inputLine = in.readLine()) != null) {
           if ((inputLine.indexOf("og:image\" content=\"https") != -1)) {
               int start = inputLine.indexOf("t=\"h");
               int end = inputLine.indexOf("g\"/>");
               // System.out.println(inputLine);
               path = inputLine.substring(start + 3, end + 1);
        }
           else {
               System.out.print("");
            }
        }
    URL url = new URL(path);
    BufferedImage image = ImageIO.read(url);
    JLabel label = new JLabel(new ImageIcon(image));
    JFrame f = new JFrame();
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.getContentPane().add(label);
    f.pack();
    f.setLocation(200,200);
    f.setVisible(true);
    in.close();
    }
}