public class Movie
{
    // instance variables - replace the example below with your own
        private double length;
        private String title;
        private boolean jonathan;
    /**
     * Constructor for objects of class Song
     */
    public Movie()
    {
        // initialise instance variables
        length = 1.25;
        title = "";
        jonathan = true;        
    }
    public double getLength() {
        return length;
    }
    public void setLength (double l) {
        length = l;}
        public String getTitle() {
        return title;
    }
    public void setTitle (String t) {
        title = t;}
    public boolean getJonathan() {
        return jonathan;
    }
    public void setJonathan (boolean j) {
         jonathan = j;
        }
}
