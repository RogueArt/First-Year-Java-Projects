public class LoopingMediaLib
{
        public static void main()
        {
            String songInfo = MediaFile.readString();
            int n = 0;
            int numSongs = 0;
            double totalLen = 0.0;
            double averageWords = 0.0;
            int len;
            String nextString;
            int nextLen;
            String longestArtist = null;
            int longestSong = 0;
            int shortestSong = 0;
            
            while (songInfo != null)
            {
                if  (n % 4 == 0) {
                    numSongs = numSongs + 1;
                }
                if (n % 4 == 1) {
                    if (songInfo.length() > 32)
                        longestArtist = songInfo;
                }
                if (n % 4 == 2) {
                    System.out.print("");
                }
                if (n % 4 == 3) {
                    totalLen = totalLen + Integer.valueOf(songInfo);
                    averageWords = totalLen/numSongs;
                    if (Integer.valueOf(songInfo) > 1152) {
                        longestSong = ((numSongs * 4) - 3);
                        System.out.println(longestSong);
                    }
                    if (Integer.valueOf(songInfo) < 250) {
                        shortestSong = numSongs;
                    }
                }
                // System.out.println(longest);
                songInfo = MediaFile.readString();
                n++;
            }
            System.out.println("Longest artist is: " + longestArtist);
            System.out.println("Average words per song: " + averageWords);
            System.out.println("Numer of songs: " + numSongs);    
            System.out.println("The longest song is song #" + longestSong);
            System.out.println("The shortest song is song #" + shortestSong);
        }
}

/*             for (String songInfo = MediaFile.readString(); songInfo != ""; songInfo = songInfo + "") {
            System.out.println(MediaFile.readString());
        }
*/

            /* while (songInfo != null)
            {
                songInfo = MediaFile.readString();
                int separator = songInfo.indexOf("|");
                int len = songInfo.length();
                System.out.print("Title:");
                System.out.println(songInfo.substring(0, separator));
                System.out.print("Rating: ");
                System.out.println(songInfo.substring(separator + 1, len));
                
            } */