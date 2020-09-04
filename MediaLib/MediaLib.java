
public class MediaLib
{
    public static void main(String args[]) 
    {
        System.out.println("Welcome to your Media Library!");
        
        //Song 1
        Song song1 = new Song(" Despacito", 2.69);
        Song song2 = new Song(true, 1.29, 9);
        System.out.println();
        System.out.println("Songs:");
        System.out.print("Name:");
        System.out.println(song1.getTitle());
        System.out.print("Rating: ");
        System.out.println(song2.getRating());
        System.out.print("Made by Justin Bieber: ");
        System.out.println(song2.getbyJustinBieber());
        System.out.print("Price: $");
        System.out.println(song1.getPrice());
        System.out.print("Favorite song: ");
        System.out.println(song2.getFavorite());
        
        //Song 2
        System.out.println();
        Song song3 = new Song(0.99, " Baby", 2);
        System.out.print("Name:");
        System.out.println(song3.getTitle());
        System.out.print("Rating: ");
        System.out.println(song3.getRating());
        System.out.print("Price: $");
        System.out.println(song3.getPrice());
        
        //Song 3
        System.out.println();
        Song song4 = new Song(" Fear Inoculum", 3.29, 10);
        System.out.print("Name:");
        System.out.println(song4.getTitle());
        System.out.print("Rating: ");
        System.out.println(song4.getRating());
        System.out.print("Price: $");
        System.out.println(song4.getPrice());
        
        //Song 4
        System.out.println();
        Song song5 = new Song(10, " Changing the Formality", 0.97);
        System.out.print("Name:");
        System.out.println(song5.getTitle());
        System.out.print("Rating: ");
        System.out.println(song5.getRating());
        System.out.print("Price: $");
        System.out.println(song5.getPrice());
        
        //Song 5
        System.out.println();
        Song song6 = new Song(" Where Do I Belong", 11, 1.49);
        System.out.print("Name:");
        System.out.println(song6.getTitle());
        System.out.print("Rating: ");
        System.out.println(song6.getRating());
        System.out.print("Price: $");
        System.out.println(song6.getPrice());
        
        //Song 6
        System.out.println();
        Song song7 = new Song(3.99, 12, " Smash Mouth", true);
        System.out.print("Name:");
        System.out.println(song7.getTitle());
        System.out.print("Rating: ");
        System.out.println(song7.getRating());
        System.out.print("Price: $");
        System.out.println(song7.getPrice());
        
        //Song 6
        System.out.println();
        Song song8 = new Song(3.99, 5, " Gangnam Style", true);
        System.out.print("Name:");
        System.out.println(song8.getTitle());
        System.out.print("Rating: ");
        System.out.println(song8.getRating());
        System.out.print("Price: $");
        System.out.println(song8.getPrice());
        
        // Activity 1.2.1 Begins
        String t = song3.getTitle();
        MediaFile.writeString(t);
        MediaFile.saveAndClose();
        
        System.out.println("-----------------------------------");
        double totalCost = 0;
        totalCost = totalCost + song1.getPrice() + song3.getPrice() + song4.getPrice()
         + song5.getPrice() + song6.getPrice() + song7.getPrice() + song8.getPrice();
        System.out.print("Total Cost: $");
        System.out.println(totalCost);
        int numSongs = 7;
        System.out.print("Number of Songs: ");
        System.out.println(numSongs);
        int totalRatings = 0;
        totalRatings = totalRatings + song1.getRating() + song3.getRating() + song4.getRating()
         + song5.getRating() + song6.getRating() + song7.getRating() + song8.getRating();
        System.out.print("Total Ratings: ");
        System.out.println(totalRatings);
        
        double avgRating = totalRatings/7;
        System.out.print("Average rating: ");
        System.out.println(avgRating);
        
        
        //Movies
        Movie movie1 = new Movie();
        System.out.println("");
        System.out.println("Movies:");
        System.out.print("Name:");
        movie1.setTitle(" Shrek");
        System.out.println(movie1.getTitle());
        System.out.print("Length: ");
        System.out.print(movie1.getLength());
        System.out.print(" Hours");
        System.out.println();
        System.out.print("Stars Jonathan Nathan = ");
        System.out.print(movie1.getJonathan());
        
        // Books        
        Book book1 = new Book();
        System.out.println("");
        System.out.println("");
        System.out.println("Books:");
        System.out.print("Name: ");
        book1.setTitle("Into Thin Air");
        System.out.println(book1.getTitle());
        System.out.print("Reviews: ");
        book1.setReviews("Wow!! This is the most thrilling book I have ever read, it feels like I was there actually on Everest standing in Krakauer's feet!");
        System.out.println(book1.getReviews());
        System.out.print("Number of pages: ");
        System.out.print(book1.getPages());
    }

}

// System.out.println(song1);