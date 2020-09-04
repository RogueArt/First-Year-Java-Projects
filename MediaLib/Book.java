public class Book
{
    // instance variables - replace the example below with your own
        private int pages;
        private String title;
        private String reviews;
    /**
     * Constructor for objects of class Song
     */
    public Book()
    {
        // initialise instance variables
        pages = 335;
        title = "";
        reviews = "";
    }
    public int getPages() {
        return pages;
    }
    public void setPages (int p) {
        pages = p;}
       
    public String getTitle() {
        return title;
    }
    public void setTitle (String t) {
        title = t;}
        
    public String getReviews() {
        return reviews;
    }
    public void setReviews (String r) {
        reviews = r;
    }
}