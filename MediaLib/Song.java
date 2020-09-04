public class Song
{
    // instance variables - replace the example below with your own
        private int rating;
        private String title;
        private boolean byJustinBieber;
        private double price;
        private boolean favorite;
    /**
     * Constructor for objects of class Song
     */
    public Song()
    {
        // initialise instance variables
        rating = 7;
        byJustinBieber = false;
        favorite = true;
        price = 420.69;
        title = "";
    }
    public String getTitle() {
        return title;
    }
    public void setTitle (String t) {
        title = t;
    }
    public int getRating() {
        return rating;  
    }
    public void setRating (int r) {
            rating = r;
        }
    public boolean getbyJustinBieber() {
        return byJustinBieber;
    }
    public void setbyJustinBieber (boolean b) {
         byJustinBieber = b;
    }
    public double getPrice() {
        return price;  
    }
    public void setRating (double p) {
            price = p;
        }
    public boolean getFavorite() {
        return favorite;
    }
    public void addToFavorite() {
        favorite = true;
    }
    public Song (String title, double price)
    {
        this.title = title;
        this.price = price;
    }
    public Song (boolean byJustinBieber, double price, int rating)
    {
        this.byJustinBieber = byJustinBieber;
        this.price = price;
        this.rating = rating;
    }
    // Song 3
    public Song (double price, String title, int rating)
    {
        this.title = title;
        this.rating = rating;
        this.price = price;
    }
    public Song (String title, double price, int rating)
    {
        this.title = title;
        this.price = price;
        this.rating = rating;
    }
    public Song (int rating, String title, double price)
    {
        this.title = title;
        this.price = price;
        this.rating = rating;
    }
    public Song (String title, int rating, double price)
    {
        this.title = title;
        this.price = price;
        this.rating = rating;
    }
    public Song (double price, int rating, String title)
    {
        this.title = title;
        this.price = price;
        this.rating = rating;
    }
    public Song (double price, int rating, String title, boolean favorite)
    {
        this.title = title;
        this.price = price;
        this.rating = rating;
    }
}
